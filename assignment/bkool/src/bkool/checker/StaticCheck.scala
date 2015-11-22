package bkool.checker

/**
 * @author nhphung
 * Name: Luong Quoc Dinh
 * Number ID: 51300526
 */

import bkool.parser._
import bkool.utils._
import java.io.{ PrintWriter, File }
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree._
import scala.collection.JavaConverters._

class StaticChecker(ast: AST) {
  def check() = {
    val bldecls = new GlobalEnvironment()
    val env = bldecls.visit(ast, null).asInstanceOf[scope]
    val ce = new ClassEnvironment();
    val clenv = ce.visit(ast, null).asInstanceOf[SymbolList]
    val tc = new TypeChecking(clenv)
    tc.visit(ast, null)
  }
}



case class scope(sl: List[(String, Type, Kind, SIKind)]) extends Context
case class myClass(name: String, parent: String, symlst: scope) extends Context
case class SymbolList(list: List[myClass]) extends Context
case class MethodType(returnType: Type, param: scope) extends Type


class GlobalEnvironment extends BKOOLVisitor {
  override def visitProgram(ast: Program, c: Context) = 
    ast.decl.foldLeft(scope(List[(String, Type, Kind, SIKind)](("io", ClassType("io"), Class, Static))))((x, y) => visit(y, x).asInstanceOf[scope])

  override def visitClassDecl(ast: ClassDecl, c: Context) = {
    val env = c.asInstanceOf[scope].sl
    val cl = if (env.exists(x => x._1 == ast.name.toString())) 
            throw Redeclared(Class, ast.name.toString()) else (ast.name.toString(), ClassType(ast.name.toString()), Class, null) :: env
    ast.decl.foldLeft(scope(List[(String, Type, Kind, SIKind)]()).asInstanceOf[Context])((x, y) => visit(y, x).asInstanceOf[scope])
    scope(cl)
  }

  override def visitMethodDecl(ast: MethodDecl, c: Context) = {
    val env = c.asInstanceOf[scope].sl
    if (env.exists(x => x._1 == ast.name.toString())) throw Redeclared(Method, ast.name.name)
    val mt = if (env.exists(x => x._1 == ast.name.toString())) throw Redeclared(Method, ast.name.name) else (ast.name.toString(), ast.returnType, if (ast.returnType != null) Method else SpecialMethod, ast.kind) :: env
    scope(mt)
  }

  override def visitAttributeDecl(ast: AttributeDecl, c: Context) = {
    val decl = ast.decl
    val env = c.asInstanceOf[scope].sl
    decl match {
      case VarDecl(a, b) => {
        val atv = if (env.exists(x => x._1 == a.toString())) 
                  throw Redeclared(Attribute, a.toString()) else (a.toString(), b, Variable, ast.kind) :: env
        scope(atv)
      }
      case ConstDecl(a, b, _) => {
        val atc = if (env.exists(x => x._1 == a.toString())) 
                  throw Redeclared(Attribute, a.toString()) else (a.toString(), b, Constant, ast.kind) :: env
        scope(atc)
      }
    }
  }
}

class ClassEnvironment extends BKOOLVisitor {
  override def visitProgram(ast: Program, c: Context) = {
    val a1 = ("writeStrLn", VoidType, Method, Static)
    val a2 = ("writeStr", VoidType, Method, Static)
    val a3 = ("readStr", StringType, Method, Static)
    val a4 = ("writeBoolLn", VoidType, Method, Static)
    val a5 = ("writeBool", VoidType, Method, Static)
    val a6 = ("readBool", BoolType, Method, Static)
    val a7 = ("writeFloatLn", VoidType, Method, Static)
    val a8 = ("writeFloat", VoidType, Method, Static)
    val a9 = ("readFloat", FloatType, Method, Static)
    val a10 = ("writeIntLn", VoidType, Method, Static)
    val a11 = ("writeInt", VoidType, Method, Static)
    val a12 = ("readInt", IntType, Method, Static)
    ast.decl.foldLeft(SymbolList(List(myClass("io", "", scope(List(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12))))))((x, y) => visit(y, x).asInstanceOf[SymbolList])
  }

  override def visitClassDecl(ast: ClassDecl, c: Context) = {
    val env = c.asInstanceOf[SymbolList].list
    if (env.exists(x => x.name == ast.name.toString())) throw Redeclared(Class, ast.name.toString())
    val atenv = ast.decl.foldLeft(scope(List[(String, Type, Kind, SIKind)]()).asInstanceOf[Context])((x, y) => visit(y, x).asInstanceOf[scope]).asInstanceOf[scope]
    SymbolList(myClass(ast.name.name, ast.parent.name, atenv) :: env)
  }

  override def visitParamDecl(ast: ParamDecl, c: Context): Object = {
    val env = c.asInstanceOf[scope].sl
    val param = if (env.exists(x => x._1 == ast.id.toString())) throw Redeclared(Parameter, ast.id.toString()) else (ast.id.toString(), ast.paramType, Parameter, Instance) :: env
    scope(param)
  }

  override def visitMethodDecl(ast: MethodDecl, c: Context) = {
    val env = c.asInstanceOf[scope].sl
    if (env.exists(x => x._1 == ast.name.toString())) throw Redeclared(Method, ast.name.name)
    val paramenv = ast.param.foldLeft(scope(List[(String, Type, Kind, SIKind)]()))((x, y) => visit(y, x).asInstanceOf[scope])
    val mtenv = if (env.exists(x => x._1 == ast.name.toString())) throw Redeclared(Method, ast.name.name) else (ast.name.toString(), MethodType(ast.returnType, paramenv), if (ast.returnType != null) Method else SpecialMethod, ast.kind) :: env
    scope(mtenv)
  }

  override def visitAttributeDecl(ast: AttributeDecl, c: Context) = {
    val decl = ast.decl
    val env = c.asInstanceOf[scope].sl
    decl match {
      case VarDecl(a, b) => {
        val varenv = if (env.exists(x => x._1 == a.toString())) throw Redeclared(Attribute, a.toString()) else (a.toString(), b, Variable, ast.kind) :: env
        scope(varenv)
      }
      case ConstDecl(a, b, _) => {
        val constenv = if (env.exists(x => x._1 == a.toString())) throw Redeclared(Attribute, a.toString()) else (a.toString(), b, Constant, ast.kind) :: env
        scope(constenv)
      }
    }
  }
}

class TypeChecking(genv: SymbolList) extends BKOOLVisitor with Utils {
  var parammeter = false;
  var memberAccess = false;
  var assignment = false;

  override def visitProgram(ast: Program, c: Context) = ast.decl.map(visit(_, null))
  
  //////////// Class
  override def visitClassDecl(ast: ClassDecl, c: Context) = {
    if (!ast.parent.name.isEmpty()) {
      val parentClass = lookup(ast.parent.name, genv.list, (x: myClass) => x.name)
      parentClass match {
        case None => throw Undeclared(Class, ast.parent.name)
        case Some(_) =>
      }
    }
    val env = myClass(ast.name.name, ast.parent.name, scope(List[(String, Type, Kind, SIKind)]()))
    ast.decl.filter(_.isInstanceOf[AttributeDecl]).foldLeft(env)((x, y) => visit(y, x).asInstanceOf[myClass])
    ast.decl.filter(_.isInstanceOf[MethodDecl]).map(visit(_, env))
  }

  //////////// Attribute
  override def visitAttributeDecl(ast: AttributeDecl, c: Context) = visit(ast.decl, c)

  //////////// Method
  override def visitMethodDecl(ast: MethodDecl, c: Context) = {
    if (ast.returnType != null) visit(ast.returnType, c)
    val env = c.asInstanceOf[myClass]
    val locenv = ast.param.foldLeft(myClass(env.name, env.parent, scope(List[(String, Type, Kind, SIKind)]())).asInstanceOf[Context])((x, y) => visit(y, x).asInstanceOf[myClass])
    parammeter = true
    visit(ast.body, locenv)
  }

  //////////// Parameter
  override def visitParamDecl(ast: ParamDecl, c: Context): Object = {
    if (ast.paramType.isInstanceOf[ClassType])
      visit(ast.paramType, c)
    val env = c.asInstanceOf[myClass]
    val locenv = env.symlst.sl
    val param = if (locenv.exists(x => x._1 == ast.id.toString())) throw Redeclared(Parameter, ast.id.toString()) 
    else (ast.id.toString(), ast.paramType, Parameter, Instance) :: locenv
    myClass(env.name, env.parent, scope(param))
  }

  //////////// Variable
  override def visitVarDecl(ast: VarDecl, c: Context) = {
    visit(ast.varType, c)
    val env = c.asInstanceOf[myClass]
    val locenv = env.symlst.sl
    val varenv = if (locenv.exists(x => x._1 == ast.variable.toString())) throw Redeclared(Variable, ast.variable.toString()) 
                    else (ast.variable.toString(), ast.varType, Variable, Instance) :: locenv
    myClass(env.name, env.parent, scope(varenv))
  }

  //////////// Constant
  override def visitConstDecl(ast: ConstDecl, c: Context) = {
    visit(ast.constType, c)
    visit(ast.const, c)
    val env = c.asInstanceOf[myClass]
     val exprType = visit(ast.const, c).asInstanceOf[(Type, Kind)]
    val locenv = env.symlst.sl
    val constenv = if (locenv.exists(x => x._1 == ast.id.toString())) throw Redeclared(Constant, ast.id.toString()) 
                    else (ast.id.toString(), ast.constType, Constant, Instance) :: locenv
    if (checkType(ast.constType, exprType._1, genv.list) == false) throw TypeMismatchInConstant(ast)                
    myClass(env.name, env.parent, scope(constenv))
  }

  //////////// Array Type
  override def visitArrayType(ast: ArrayType, c: Context) = {
    visit(ast.eleType, c)
  }

  //////////// Class Type
  override def visitClassType(ast: ClassType, c: Context) = {
    val findClass = lookup(ast.classType, genv.list, (x: myClass) => x.name)
    findClass match {
      case None => throw Undeclared(Class, ast.classType)
      case Some(t) => c
    }
  }

  //////////// BinaryOp
  override def visitBinaryOp(ast: BinaryOp, c: Context) = {
    val lhs = visit(ast.left, c).asInstanceOf[(Type, Kind)]
    val rhs = visit(ast.right, c).asInstanceOf[(Type, Kind)]
    val left = lhs._1
    val right = lhs._1
    val kind = if (lhs._2 == Constant || rhs._2 == Constant) Constant
               else Variable
    ast.op match {
                 ////////////// Arithmetic Expression /////////////////
                 case "+" | "-" | "*" => {
                   if ((left == IntType || left == FloatType) && (right == IntType || right == FloatType))
                        if (left == FloatType || right == FloatType)
                            (FloatType, kind)
                        else (IntType, kind)
                      else throw TypeMismatchInExpression(ast)
                 }
                 
                 case "/" => {
                   if ((left == IntType || left == FloatType) && (right == IntType || right == FloatType))
                        (FloatType, kind)
                   else throw TypeMismatchInExpression(ast)     
                 }
                 
                 case "\\" | "%" => {
                   if (left == IntType && right == IntType) 
                       (IntType, kind)
                   else throw TypeMismatchInExpression(ast)    
                 }
                 
                 ////////////// Boolean Expression ////////////////
                 case "&&" | "||" => {
                   if (left == BoolType && right == BoolType)
                       (BoolType, kind)
                   else throw TypeMismatchInExpression(ast)    
                 }
                 
                 ////////////// Relational Expression //////////////////
                 case "==" | "<>" => {
                   if ((left != VoidType && right != VoidType) || (left != NullType ) || (right != NullType))
                       (BoolType, kind)
                   else throw TypeMismatchInExpression(ast)   
                 }
                 
                 case ">" | "<" | ">=" | "<=" => {
                   if ((left == IntType || left == FloatType) && (right == IntType || right == FloatType))
                       (BoolType, kind)   
                   else throw TypeMismatchInExpression(ast)                     
                 }
                 
                 /////////////// String Expression ///////////////
                 case "^" => {
                   if (left == StringType && right == StringType)
                       (StringType, kind)
                   else throw TypeMismatchInExpression(ast)    
                 }
                 
                 /////////////// Index Expression ////////////////
                 
               }
  }
  
  //////////// UnaryOp
   override def visitUnaryOp(ast: UnaryOp, c: Context) = {
     val env = visit(ast.body, c).asInstanceOf[(Type, Kind)]
     val right = env._1
     ast.op match {
       case "+" | "-" => {
         if (right == IntType || right == FloatType)
             (right, env._2)
         else throw TypeMismatchInExpression(ast)    
       }
       
       case "!" => {
         if (right == BoolType)
             (right, env._2)
         else throw TypeMismatchInExpression(ast)    
       }
     }
   }
  
  //////////// NewExpr 
  override def visitNewExpr(ast: NewExpr, c: Context) = {
    ast.exprs.map(visit(_, c))
    val findClass = lookup(ast.name.name, genv.list, (x: myClass) => x.name)
    findClass match {
      case None => throw Undeclared(Class, ast.name.name)
      case Some(t) => {
        val con = lookupClass(ast.name.name, t, genv.list)
        val param = con match {
          case None => List[Type]()
          case Some(x) => {
            x._2.asInstanceOf[MethodType].param.sl.map(x => x._2)
          }
        }
        val parameter = ast.exprs.foldLeft(List[Type]())((x, y) => visit(y, c).asInstanceOf[(Type, Kind)]._1 :: x)
        if (parameter.size == param.size) {
          val check = param.zip(parameter).foldLeft(true)((x, y) => checkType(y._1, y._2, genv.list))
          if (check == true)
              (ClassType(t.name), Variable)
           else throw TypeMismatchInExpression(ast)   
        }
        else throw TypeMismatchInExpression(ast)
      }
    }
  }

  //////////// CallExpr
  override def visitCallExpr(ast: CallExpr, c: Context) = {
    ast.params.map(visit(_, c))
    if (ast.cName.isInstanceOf[Id]) memberAccess = true
    val callType = visit(ast.cName, c).asInstanceOf[(Type, Kind)]
    callType._1 match {
      case ClassType(name) => {
        val findClass = lookup(name, genv.list, (x: myClass) => x.name)
        findClass match {
          case None => throw Undeclared(Class, name)
          case Some(t) => {
            val method = lookupClass(ast.method.name, t, genv.list)
            method match {
              case None => throw Undeclared(Method, ast.method.name)
              case Some(t) => {
                if (t._3 != Method) throw TypeMismatchInExpression(ast)
                else if (t._2.asInstanceOf[MethodType].returnType == VoidType)
                        throw TypeMismatchInExpression(ast)
                 else {
                  val param = ast.params.foldLeft(List[Type]())((x, y) => visit(y, c).asInstanceOf[(Type, Kind)]._1 :: x)
                  val parameter = t._2.asInstanceOf[MethodType].param.sl.map(x => x._2)
                  if (param.size == parameter.size) {
                    val check = parameter.zip(param).foldLeft(true)((x, y) => checkType(y._1, y._2, genv.list))
                    if (check == true)
                        (t._2.asInstanceOf[MethodType].returnType, t._3)
                    else throw TypeMismatchInExpression(ast)    
                  }
                  else throw TypeMismatchInExpression(ast)
                }   
              }
            }
          }
        }
      }
      case _ => throw TypeMismatchInExpression(ast)
    }
  }

  //////////// Identifier
  override def visitId(ast: Id, c: Context) = {
    val env = c.asInstanceOf[myClass].symlst.sl
    val id = lookup(ast.name, env, (x: (String, Type, Kind, SIKind)) => x._1)
    id match {
      case None => {
        memberAccess match {
          case true => {
            val findClass = lookup(ast.name, genv.list, (x: myClass) => x.name)
            findClass match {
              case None => throw Undeclared(Identifier, ast.name)
              case Some(t) => {
                memberAccess = false;
                (ClassType(ast.name), Variable)
              }
            }
          }
          case false => throw Undeclared(Identifier, ast.name)
        }
      }
      case Some(t) => (t._2, t._3)
    }
  }

  //////////// Array Cell
  override def visitArrayCell(ast: ArrayCell, c: Context) = {
    visit(ast.idx, c)
    val arrayType = visit(ast.arr, c).asInstanceOf[(Type, Kind)]
    val idType = visit(ast.idx, c).asInstanceOf[(Type, Kind)]
    if (arrayType._1.isInstanceOf[ArrayType] && idType._1 == IntType) {
      (arrayType._1.asInstanceOf[ArrayType].eleType, arrayType._2)
    }
    else throw TypeMismatchInExpression(ast)
  }

  //////////// Field Access
  override def visitFieldAccess(ast: FieldAccess, c: Context) = {
    if (ast.name.isInstanceOf[Id]) memberAccess = true
    val fieldType = visit(ast.name, c).asInstanceOf[(Type, Kind)]
    fieldType._1 match {
      case ClassType(name) => {
        val findClass = lookup(name, genv.list, (x: myClass) => x.name)
        findClass match {
          case None => throw Undeclared(Class, name)
          case Some(t) => {
            val field = lookupClass(ast.field.name, t, genv.list)
            field match {
              case None => throw Undeclared(Attribute, ast.field.name)
              case Some(t) => {
                if (t._3 != Constant && t._3 != Variable) throw TypeMismatchInExpression(ast)
                else {
                (t._2, t._3)
                }
              }
            }
          }
        }
      }
      case _ => throw TypeMismatchInExpression(ast)
    }
  }

  //////////// Block
  override def visitBlock(ast: Block, c: Context) = {
    val classenv = c.asInstanceOf[myClass]
    val env = if (parammeter == true) {
      parammeter = false
      c.asInstanceOf[myClass]
    } else myClass(classenv.name, classenv.parent, scope(List[(String, Type, Kind, SIKind)]()))
    val block = ast.decl.foldLeft(env)((x, y) => visit(y, x).asInstanceOf[myClass])
    ast.stmt.map(visit(_, myClass(classenv.name, classenv.parent, scope(classenv.symlst.sl ++ block.symlst.sl))))
    c
  }

  //////////// Assign
  override def visitAssign(ast: Assign, c: Context) = {
    val lhs = visit(ast.leftHandSide, c).asInstanceOf[(Type, Kind)]
    if (lhs._2 == Constant) throw CannotAssignToConstant(ast)
    val rhs = visit(ast.expr, c).asInstanceOf[(Type, Kind)]
    if (checkType(lhs._1, rhs._1, genv.list) == false) throw TypeMismatchInStatement(ast)
    c  
  }

  //////////// If
  override def visitIf(ast: If, c: Context) = {
    val env = visit(ast.expr, c).asInstanceOf[(Type, Kind)]
    if (env._1 != BoolType) throw TypeMismatchInStatement(ast)
    visit(ast.thenStmt, c)
    ast.elseStmt match {
      case None =>
      case Some(t) => visit(t, c)
    }
    c
  }

  //////////// Call
  override def visitCall(ast: Call, c: Context) = {
    if (ast.parent.isInstanceOf[Id]) memberAccess = true
    val callType = visit(ast.parent, c).asInstanceOf[(Type, Kind)]
    callType._1 match {
      case ClassType(name) => {
        val findClass = lookup(name, genv.list, (x: myClass) => x.name)
        findClass match {
          case None => throw Undeclared(Class, name)
          case Some(t) => {
            val method = lookupClass(ast.method.name, t, genv.list)
            method match {
              case None => throw Undeclared(Method, ast.method.name)
              case Some(t) => {
                if (t._3 != Method) throw Undeclared(Method, ast.method.name)
                else if (t._2.asInstanceOf[MethodType].returnType != VoidType) throw TypeMismatchInStatement(ast)
                else {
                  val param = ast.params.foldLeft(List[Type]())((x,y) => visit(y, c).asInstanceOf[(Type, Kind)]._1 :: x)
                  val protypeparam = t._2.asInstanceOf[MethodType].param.sl.map(x => x._2)
                  if (param.size == protypeparam.size) {
                    val check = protypeparam.zip(param).foldLeft(true)((x, y) => checkType(y._1, y._2, genv.list) && x)
                    if (check == true) c
                    else throw TypeMismatchInStatement(ast)
                  }
                  else throw TypeMismatchInStatement(ast)
                }
              }
            }
          }
        }
      }
      case _ => throw TypeMismatchInStatement(ast)
    }
  }

  //////////// While
  override def visitWhile(ast: While, c: Context) = {
    val env = visit(ast.expr, c).asInstanceOf[(Type, Kind)]
    if (env._1 != BoolType) throw TypeMismatchInStatement(ast)
    visit(ast.loop, c)
    c
  }

  //////////// Return
  var methodReturnType:Type = VoidType
  var loopLevel = 0
  override def visitReturn(ast: Return, c: Context) = {
    val returnType = visit(ast.expr, c).asInstanceOf[(Type, Kind)]
    if (checkType(methodReturnType, returnType._1, genv.list)) throw TypeMismatchInStatement(ast)
    Statement(true)
  }

  override def visitIntLiteral(ast: IntLiteral, c: Context) = (IntType, Constant)

  override def visitFloatLiteral(ast: FloatLiteral, c: Context) = (FloatType, Constant)

  override def visitStringLiteral(ast: StringLiteral, c: Context) = (StringType, Constant)

  override def visitBooleanLiteral(ast: BooleanLiteral, c: Context) = (BoolType, Constant)

  override def visitNullLiteral(ast: NullLiteral.type, c: Context) = (NullType, Constant)

  override def visitSelfLiteral(ast: SelfLiteral.type, c: Context) = {
    (ClassType(c.asInstanceOf[myClass].name), Variable)
  }
}

class BKOOLVisitor extends Visitor {
  override def visit(ast: AST, c: Context): Object = ast.accept(this, c)
  override def visitProgram(ast: Program, c: Context): Object = c
  override def visitVarDecl(ast: VarDecl, c: Context): Object = c
  override def visitConstDecl(ast: ConstDecl, c: Context): Object = c
  override def visitParamDecl(ast: ParamDecl, c: Context): Object = c
  override def visitClassDecl(ast: ClassDecl, c: Context): Object = c
  override def visitMethodDecl(ast: MethodDecl, c: Context): Object = c
  override def visitAttributeDecl(ast: AttributeDecl, c: Context): Object = c
  override def visitInstance(ast: Instance.type, c: Context): Object = c
  override def visitStatic(ast: Static.type, c: Context): Object = c
  override def visitIntType(ast: IntType.type, c: Context): Object = c
  override def visitFloatType(ast: FloatType.type, c: Context): Object = c
  override def visitBoolType(ast: BoolType.type, c: Context): Object = c
  override def visitStringType(ast: StringType.type, c: Context): Object = c
  override def visitVoidType(ast: VoidType.type, c: Context): Object = c
  override def visitArrayType(ast: ArrayType, c: Context): Object = c
  override def visitClassType(ast: ClassType, c: Context): Object = c
  override def visitBinaryOp(ast: BinaryOp, c: Context): Object = c
  override def visitUnaryOp(ast: UnaryOp, c: Context): Object = c
  override def visitNewExpr(ast: NewExpr, c: Context): Object = c
  override def visitCallExpr(ast: CallExpr, c: Context): Object = c
  override def visitId(ast: Id, c: Context): Object = c
  override def visitArrayCell(ast: ArrayCell, c: Context): Object = c
  override def visitFieldAccess(ast: FieldAccess, c: Context): Object = c
  override def visitBlock(ast: Block, c: Context): Object = c
  override def visitAssign(ast: Assign, c: Context): Object = c
  override def visitIf(ast: If, c: Context): Object = c
  override def visitCall(ast: Call, c: Context): Object = c
  override def visitWhile(ast: While, c: Context): Object = c
  override def visitBreak(ast: Break.type, c: Context): Object = c
  override def visitContinue(ast: Continue.type, c: Context): Object = c
  override def visitReturn(ast: Return, c: Context): Object = c
  override def visitIntLiteral(ast: IntLiteral, c: Context): Object = c
  override def visitFloatLiteral(ast: FloatLiteral, c: Context): Object = c
  override def visitStringLiteral(ast: StringLiteral, c: Context): Object = c
  override def visitBooleanLiteral(ast: BooleanLiteral, c: Context): Object = c
  override def visitNullLiteral(ast: NullLiteral.type, c: Context): Object = c
  override def visitSelfLiteral(ast: SelfLiteral.type, c: Context): Object = c
}

case class Statement(isReturn: Boolean) extends Context
object NullType extends Type

trait Utils {
  def lookup[T](name: String, lst: List[T], func: T => String): Option[T] = lst match {
    case List() => None
    case head :: tail => if (func(head) == name) Some(head) else lookup(name, tail, func)
  }

  def lookupClass(name: String, currentClass: myClass, lst: List[myClass]): Option[(String, Type, Kind, SIKind)] = {
    val inCurrentClass = lookup(name, currentClass.symlst.sl, (x: (String, Type, Kind, SIKind)) => x._1)
    inCurrentClass match {
      case None => currentClass.parent match {
        case "" => None
        case _ => {
          val parentClass = lookup(currentClass.parent, lst, (x: myClass) => x.name)
          parentClass match {
            case None => None
            case Some(t) => lookupClass(name, t, lst)
          }
        }
      }
      case Some(t) => Some(t)
    }
  }
  
  def lookupId(name: String, lst: List[myClass]): Boolean = 
    lst match {
    case List()       => false
    case (a) :: tail => if (name == a) true else lookupId(name, tail)
    case _:: tail => lookupId(name, tail)
  }

  def checkType(lhs: Type, rhs: Type, lst: List[myClass]): Boolean = {
    lhs match {
      case VoidType => false
      case ClassType(t) => {
        rhs match {
          case ClassType(r) => {
            if (r == t) true
            else {
              val currentClass = lookup(r, lst, (x: myClass) => x.name)
              currentClass match {
                case None => false
                case Some(x) => checkType(lhs, ClassType(x.parent), lst)
              }
            }
          }
          case NullType => true
          case _ => false
        }

      }
      case ArrayType(ldim, ltype) => {
        rhs match {
          case ArrayType(rdim, rtype) => {
            if (checkType(ltype, rtype, lst) == true && ldim == rdim) true
            else false
          }
          case _ => false
        }
      }
      case FloatType => {
        if (rhs == FloatType || rhs == IntType) true
        else false
      }
      case _ => {
        if (rhs == lhs) true
        else false
      }
    }
  }
}
