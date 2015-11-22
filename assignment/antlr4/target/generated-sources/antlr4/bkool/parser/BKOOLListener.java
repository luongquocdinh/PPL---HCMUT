// Generated from BKOOL.g4 by ANTLR 4.5.1

	package bkool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BKOOLParser}.
 */
public interface BKOOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BKOOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BKOOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(BKOOLParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(BKOOLParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#listmember}.
	 * @param ctx the parse tree
	 */
	void enterListmember(BKOOLParser.ListmemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#listmember}.
	 * @param ctx the parse tree
	 */
	void exitListmember(BKOOLParser.ListmemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(BKOOLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(BKOOLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#declare1}.
	 * @param ctx the parse tree
	 */
	void enterDeclare1(BKOOLParser.Declare1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#declare1}.
	 * @param ctx the parse tree
	 */
	void exitDeclare1(BKOOLParser.Declare1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(BKOOLParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(BKOOLParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BKOOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BKOOLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#type1}.
	 * @param ctx the parse tree
	 */
	void enterType1(BKOOLParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#type1}.
	 * @param ctx the parse tree
	 */
	void exitType1(BKOOLParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#constDeclare}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclare(BKOOLParser.ConstDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#constDeclare}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclare(BKOOLParser.ConstDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclare(BKOOLParser.VarDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclare(BKOOLParser.VarDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#listID}.
	 * @param ctx the parse tree
	 */
	void enterListID(BKOOLParser.ListIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#listID}.
	 * @param ctx the parse tree
	 */
	void exitListID(BKOOLParser.ListIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(BKOOLParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(BKOOLParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#listparameter}.
	 * @param ctx the parse tree
	 */
	void enterListparameter(BKOOLParser.ListparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#listparameter}.
	 * @param ctx the parse tree
	 */
	void exitListparameter(BKOOLParser.ListparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#listpara_member}.
	 * @param ctx the parse tree
	 */
	void enterListpara_member(BKOOLParser.Listpara_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#listpara_member}.
	 * @param ctx the parse tree
	 */
	void exitListpara_member(BKOOLParser.Listpara_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BKOOLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BKOOLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(BKOOLParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(BKOOLParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCell}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterArrayCell(BKOOLParser.ArrayCellContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCell}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitArrayCell(BKOOLParser.ArrayCellContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterUnary2(BKOOLParser.Unary2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitUnary2(BKOOLParser.Unary2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterUnary1(BKOOLParser.Unary1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitUnary1(BKOOLParser.Unary1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(BKOOLParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(BKOOLParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess1(BKOOLParser.FieldAccess1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess1(BKOOLParser.FieldAccess1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code fact1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterFact1(BKOOLParser.Fact1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fact1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitFact1(BKOOLParser.Fact1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterBinary1(BKOOLParser.Binary1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitBinary1(BKOOLParser.Binary1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterBinary2(BKOOLParser.Binary2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary2}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitBinary2(BKOOLParser.Binary2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr1(BKOOLParser.CallExpr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr1}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr1(BKOOLParser.CallExpr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary3}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterBinary3(BKOOLParser.Binary3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary3}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitBinary3(BKOOLParser.Binary3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary4}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterBinary4(BKOOLParser.Binary4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary4}
	 * labeled alternative in {@link BKOOLParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitBinary4(BKOOLParser.Binary4Context ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(BKOOLParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(BKOOLParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void enterList_expression(BKOOLParser.List_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void exitList_expression(BKOOLParser.List_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(BKOOLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(BKOOLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(BKOOLParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(BKOOLParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(BKOOLParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(BKOOLParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(BKOOLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(BKOOLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(BKOOLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(BKOOLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(BKOOLParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(BKOOLParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(BKOOLParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(BKOOLParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(BKOOLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(BKOOLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BKOOLParser#invocation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_stmt(BKOOLParser.Invocation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BKOOLParser#invocation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_stmt(BKOOLParser.Invocation_stmtContext ctx);
}