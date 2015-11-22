package bkool.parser
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import java.io.{PrintWriter,File}
import org.antlr.v4.runtime.ANTLRFileStream
import bkool.utils._
import scala.collection.JavaConverters._
import org.antlr.v4.runtime.tree._

class ASTGeneration extends BKOOLBaseVisitor[Object] {


  def flatten(ls: List[Any]): List[Any] = ls flatMap {
  case i: List[_] => flatten(i)
  case e => List(e)
  }
  
  def flattenList[A](l: List[Any]): List[A] = {
    var acc = List[A]()
    l foreach ( entry => entry match {
      case a: List[Any] => acc = acc ::: flattenList(a)
      case b: A => acc = acc :+ b
    })
    acc
  }
  
  override def visitProgram(ctx:BKOOLParser.ProgramContext) = Program(ctx.classDecl().asScala.map(visit).toList.asInstanceOf[List[ClassDecl]]) 
    //Program(ctx.classDecl().asScala.map(visit).toList().asInstanceOf[List[ClassDecl]])
  override def visitClassDecl(ctx:BKOOLParser.ClassDeclContext)={
    val name = ctx.ID(0).getText
    val parent = if (ctx.ID(1) == null) "" else ctx.ID(1).getText
    val decl = if (ctx.listmember()!= null) flattenList[MemDecl](ctx.listmember().asScala.map(visit).toList.asInstanceOf[List[MemDecl]]) else List()
    
    ClassDecl(Id(name),Id(parent),decl) 
    
  }
  
  
  
  override def visitListmember(ctx:BKOOLParser.ListmemberContext) = {
    visit(ctx.getChild(0))
    //if (ctx.attribute() == null)    
      //visit(ctx.getChild(0)).asInstanceOf[MethodDecl]
    //else
       //flatten(visit(ctx.getChild(0)).asInstanceOf[List[AttributeDecl]])
      //flatten(ctx.attribute().asScala.map(visit).toList.asInstanceOf[List[AttributeDecl]])
      //ctx.attribute().asScala.map(visit).toList.asInstanceOf[List[AttributeDecl]]
  }
  
  override def  visitDeclare(ctx:BKOOLParser.DeclareContext)=visit(ctx.getChild(0))
  
   override def visitAttribute(ctx:BKOOLParser.AttributeContext ) ={ 
    val kind = if (ctx.STATIC() == null) Instance else Static
    
    if (ctx.FINAL() != null)
    {
       val id = ctx.ID().getText
       val constType= visit(ctx.`type`()).asInstanceOf[Type]
       val const = visit(ctx.expression()).asInstanceOf[Expr]
       val decl = ConstDecl(Id(id),constType, const)
        AttributeDecl(kind,decl)
    }
    else{
      val variable = visit(ctx.listID()).asInstanceOf[List[String]]               //list Id
      val varType = visit(ctx.`type`()).asInstanceOf[Type] 
      if (variable.length == 1){ 
          val decl = VarDecl(Id(variable(0)),varType) 
          AttributeDecl(kind,decl)
      }
      else {
        
        val decl = variable.map(x => VarDecl(Id(x),varType)).toList
        
        if (decl.length == 1) 
            AttributeDecl(kind,decl(0))
        else 
            decl.map(x => AttributeDecl(kind,x))
      }
    }
        //AttributeDecl(kind,decl)
    
  }
  
  override def visitType(ctx:BKOOLParser.TypeContext) ={
    if (ctx.getChildCount == 1)
       visit(ctx.getChild(0))
    else{
        val dimen = ctx.INTEGER_LIT().getText.toInt
        val eleType= visit(ctx.type1()).asInstanceOf[Type]
        ArrayType(IntLiteral(dimen),eleType)
    }
  }
  
  override def visitType1( ctx:BKOOLParser.Type1Context) = ctx.getChild(0).getText match {
    case "integer" => IntType
    case "float" => FloatType
    case "string" => StringType
    case "void" => VoidType
    case "bool" => BoolType
    case _ =>  ClassType(ctx.getChild(0).getText)
  }
  
  override def visitVarDeclare( ctx : BKOOLParser.VarDeclareContext)= { 
      val variable = visit(ctx.listID()).asInstanceOf[List[String]]               //list Id
      val varType = visit(ctx.`type`()).asInstanceOf[Type] 
      if (variable.length == 1) 
          VarDecl(Id(variable(0)),varType) 
      else 
        variable.map(x => VarDecl(Id(x),varType)).toList
  }
  
  override def visitListID(ctx:BKOOLParser.ListIDContext) = ctx.ID().asScala.map(x => x.getText).toList
  
  override def visitConstDeclare(ctx:BKOOLParser.ConstDeclareContext ) ={ 
    val id = ctx.ID().getText
    val constType= visit(ctx.`type`()).asInstanceOf[Type]
    val const = visit(ctx.expression()).asInstanceOf[Expr]
    ConstDecl(Id(id),constType, const)
  }
  
  override def visitMethodDecl(ctx :BKOOLParser.MethodDeclContext ) ={
  
    val kind = if (ctx.STATIC() == null) Instance else Static
    val name = ctx.ID().getText
    val param= if (ctx.listparameter() != null) visit(ctx.listparameter()).asInstanceOf[List[ParamDecl]] else List() 
    val returnType = if (ctx.`type`() == null) null else visit(ctx.`type`()).asInstanceOf[Type]
    val body = visit(ctx.block_stmt()).asInstanceOf[Stmt]
    MethodDecl(kind,Id(name),param,returnType,body)
  }
  

  
  override def visitListparameter(ctx:BKOOLParser.ListparameterContext ) ={ 
       //var2par(ctx.listpara_member().asScala.map(visit).toList.asInstanceOf[List[VarDecl]])
       flattenList[ParamDecl](ctx.listpara_member().asScala.map(visit).toList.asInstanceOf[List[ParamDecl]])
  }
  
  override def visitListpara_member(ctx:BKOOLParser.Listpara_memberContext)= {      
      val variable = visit(ctx.listID()).asInstanceOf[List[String]]               //list Id
      val varType = visit(ctx.`type`()).asInstanceOf[Type] 
      if (variable.length == 1) 
          ParamDecl(Id(variable(0)),varType) 
      else 
        variable.map(x => ParamDecl(Id(x),varType)) 
  }
  
  override def visitBlock_stmt(ctx:BKOOLParser.Block_stmtContext)= {
    
    val stmt = if (ctx.stmt()!= null) flattenList[Stmt](ctx.stmt().asScala.map(visit).toList.asInstanceOf[List[Stmt]]) else List() 
    val decl = if (ctx.declare()!= null) flattenList[Decl](ctx.declare().asScala.map(visit).toList.asInstanceOf[List[Decl]]) else List()
    Block(decl,stmt)
      
  }
  
  override def visitExpression(ctx:BKOOLParser.ExpressionContext)= { 
    if (ctx.getChildCount>1 ){
      val expr1 = visit(ctx.expression2(0)).asInstanceOf[Expr]
      val expr2 = visit(ctx.expression2(1)).asInstanceOf[Expr]
      BinaryOp(ctx.getChild(1).getText,expr1, expr2) 
    }
    else{
      visit(ctx.getChild(0))
    }
  }
  
  override def visitExpression2(ctx:BKOOLParser.Expression2Context) ={ 
      if (ctx.getChildCount>1 ){
      val expr1 = visit(ctx.expression1(0)).asInstanceOf[Expr]
      val expr2 = visit(ctx.expression1(1)).asInstanceOf[Expr]
      BinaryOp(ctx.getChild(1).getText,expr1, expr2) 
    }
    else{
      visit(ctx.getChild(0))
    }
  }
  
  override def visitNewExpr(ctx:BKOOLParser.NewExprContext) = { 
    val name = ctx.ID().getText
    val exprs = if ( ctx.list_expression() == null ) List() else visit(ctx.list_expression()).asInstanceOf[List[Expr]]
    NewExpr(Id(name), exprs)  
  }
  
  override def visitArrayCell( ctx:BKOOLParser.ArrayCellContext)= { 
      val expr1 = visit(ctx.expression1(0)).asInstanceOf[Expr]
      val expr2 = visit(ctx.expression1(1)).asInstanceOf[Expr]
      ArrayCell(expr1,expr2)
  }
  
    override def visitUnary2(ctx:BKOOLParser.Unary2Context )= {
    val op =  ctx.getChild(0).getText
    val body = visit(ctx.expression1()).asInstanceOf[Expr] 
    UnaryOp(op, body)
  }
  
  override  def visitBinary1(ctx:BKOOLParser.Binary1Context )= {
    val op = ctx.getChild(1).getText
    val left = visit(ctx.expression1(0)).asInstanceOf[Expr] 
    val right = visit(ctx.expression1(1)).asInstanceOf[Expr] 
    BinaryOp(op, left, right)
  }
  
  override def visitUnary1(ctx:BKOOLParser.Unary1Context )= {
    val op =  ctx.getChild(0).getText
    val body = visit(ctx.expression1()).asInstanceOf[Expr] 
    UnaryOp(op, body)
  }
  
  override  def visitBinary2(ctx:BKOOLParser.Binary2Context )= {
    val op = ctx.getChild(1).getText
    val left = visit(ctx.expression1(0)).asInstanceOf[Expr] 
    val right = visit(ctx.expression1(1)).asInstanceOf[Expr] 
    BinaryOp(op, left, right)
  }
  
  override def visitFieldAccess1( ctx:BKOOLParser.FieldAccess1Context)={ 
     val field = ctx.ID().getText
     val exprs = visit(ctx.expression1()).asInstanceOf[Expr]  
     FieldAccess(exprs, Id(field))
  }
  
  override  def visitBinary3(ctx:BKOOLParser.Binary3Context )= {
    val op = ctx.getChild(1).getText
    val left = visit(ctx.expression1(0)).asInstanceOf[Expr] 
    val right = visit(ctx.expression1(1)).asInstanceOf[Expr] 
    BinaryOp(op, left, right)
  }
  
    
  override  def visitBinary4(ctx:BKOOLParser.Binary4Context )= {
    val op = ctx.getChild(1).getText
    val left = visit(ctx.expression1(0)).asInstanceOf[Expr] 
    val right = visit(ctx.expression1(1)).asInstanceOf[Expr] 
    BinaryOp(op, left, right)
  }
    
  override def visitCallExpr1( ctx:BKOOLParser.CallExpr1Context)= { 
    val method = ctx.ID().getText
    val cName = visit(ctx.expression1()).asInstanceOf[Expr]  
    val params = if ( ctx.list_expression() == null ) List() else visit(ctx.list_expression()).asInstanceOf[List[Expr]]
    CallExpr(cName, Id(method),params) 
  }
  
  override def visitFact1(ctx:BKOOLParser.Fact1Context )= visit(ctx.getChild(0))
  
  override def visitFact(ctx:BKOOLParser.FactContext) ={
     if (ctx.getChildCount > 1)
        visit(ctx.expression())
     else {
        if (ctx.ID() != null) Id(ctx.ID().getText)
        else
        if (ctx.STRING_LIT() != null) StringLiteral(ctx.STRING_LIT().getText)
        else
        if (ctx.INTEGER_LIT() != null) IntLiteral(ctx.INTEGER_LIT().getText.toInt)
        else
        if (ctx.FLOAT_LIT() != null)   FloatLiteral(ctx.FLOAT_LIT().getText.toFloat) 
        else
        if (ctx.SELF()!= null) SelfLiteral
        else
        if (ctx.FALSE()!= null)  BooleanLiteral(ctx.FALSE().getText.toBoolean)
        else
        if (ctx.TRUE()!= null)  BooleanLiteral(ctx.TRUE().getText.toBoolean)
        else
        if (ctx.NULL()!= null) NullLiteral 
        else null
        
     }
  }
  
  override def visitList_expression(ctx:BKOOLParser.List_expressionContext )= ctx.expression().asScala.map(visit).toList
  
  override def visitStmt(ctx:BKOOLParser.StmtContext )= visit(ctx.getChild(0))
  
  override def visitAssign_stmt(ctx:BKOOLParser.Assign_stmtContext )= {
    val lhs = visit(ctx.expression(0)).asInstanceOf[LHS]
    val expr = visit(ctx.expression(1)).asInstanceOf[Expr]
    Assign(lhs, expr)
  }
  
  override def visitIf_stmt(ctx:BKOOLParser.If_stmtContext)= {
    val expr = visit(ctx.expression()).asInstanceOf[Expr]  
      val thenStmt = visit(ctx.stmt(0)).asInstanceOf[Stmt]
      val elseStmt = if (ctx.stmt(1)!= null) Some(visit(ctx.stmt(1))).asInstanceOf[Option[Stmt]] else None
      If(expr,thenStmt,elseStmt)
    
  }
  
  override def visitWhile_stmt(ctx:BKOOLParser.While_stmtContext) ={ 
     val expr= visit(ctx.expression()).asInstanceOf[Expr]
     val loop = visit(ctx.stmt()).asInstanceOf[Stmt]
     While(expr,loop) 
  }
  
  override def visitBreak_stmt(ctx:BKOOLParser.Break_stmtContext ) = Break 
  
  override def visitContinue_stmt(ctx:BKOOLParser.Continue_stmtContext ) = Continue
  
  override def visitReturn_stmt(ctx:BKOOLParser.Return_stmtContext )= {
    val expr = visit(ctx.expression()).asInstanceOf[Expr]
    Return(expr)
  }
  
  override def visitInvocation_stmt(ctx:BKOOLParser.Invocation_stmtContext) ={
    val parent = visit(ctx.expression()).asInstanceOf[Expr]
    val method =  ctx.ID().getText
    val params = if ( ctx.list_expression() == null ) List() else visit(ctx.list_expression()).asInstanceOf[List[Expr]]
    Call( parent, Id(method),params) 
  }
  
  override def visitTerminal(node: TerminalNode) = node.getText
}