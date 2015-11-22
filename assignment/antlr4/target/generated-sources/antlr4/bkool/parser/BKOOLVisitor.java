// Generated from BKOOL.g4 by ANTLR 4.5.1

	package bkool.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BKOOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BKOOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BKOOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(BKOOLParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#listmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListmember(BKOOLParser.ListmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(BKOOLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#declare1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare1(BKOOLParser.Declare1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(BKOOLParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BKOOLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#type1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType1(BKOOLParser.Type1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#constDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclare(BKOOLParser.ConstDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(BKOOLParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#listID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListID(BKOOLParser.ListIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(BKOOLParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#listparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparameter(BKOOLParser.ListparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#listpara_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListpara_member(BKOOLParser.Listpara_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BKOOLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(BKOOLParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCell}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCell(BKOOLParser.ArrayCellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary2(BKOOLParser.Unary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary1(BKOOLParser.Unary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(BKOOLParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess1(BKOOLParser.FieldAccess1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fact1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact1(BKOOLParser.Fact1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary1(BKOOLParser.Binary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary2(BKOOLParser.Binary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr1(BKOOLParser.CallExpr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary3}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary3(BKOOLParser.Binary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary4}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary4(BKOOLParser.Binary4Context ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(BKOOLParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#list_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expression(BKOOLParser.List_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BKOOLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(BKOOLParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(BKOOLParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(BKOOLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(BKOOLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(BKOOLParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(BKOOLParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(BKOOLParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BKOOLParser#invocation_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation_stmt(BKOOLParser.Invocation_stmtContext ctx);
}