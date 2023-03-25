// Generated from grulev3 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grulev3Parser}.
 */
public interface grulev3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#grl}.
	 * @param ctx the parse tree
	 */
	void enterGrl(grulev3Parser.GrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#grl}.
	 * @param ctx the parse tree
	 */
	void exitGrl(grulev3Parser.GrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void enterRuleEntry(grulev3Parser.RuleEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#ruleEntry}.
	 * @param ctx the parse tree
	 */
	void exitRuleEntry(grulev3Parser.RuleEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#salience}.
	 * @param ctx the parse tree
	 */
	void enterSalience(grulev3Parser.SalienceContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#salience}.
	 * @param ctx the parse tree
	 */
	void exitSalience(grulev3Parser.SalienceContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(grulev3Parser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(grulev3Parser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void enterRuleDescription(grulev3Parser.RuleDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#ruleDescription}.
	 * @param ctx the parse tree
	 */
	void exitRuleDescription(grulev3Parser.RuleDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#whenScope}.
	 * @param ctx the parse tree
	 */
	void enterWhenScope(grulev3Parser.WhenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#whenScope}.
	 * @param ctx the parse tree
	 */
	void exitWhenScope(grulev3Parser.WhenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#thenScope}.
	 * @param ctx the parse tree
	 */
	void enterThenScope(grulev3Parser.ThenScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#thenScope}.
	 * @param ctx the parse tree
	 */
	void exitThenScope(grulev3Parser.ThenScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterThenExpressionList(grulev3Parser.ThenExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#thenExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitThenExpressionList(grulev3Parser.ThenExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void enterThenExpression(grulev3Parser.ThenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#thenExpression}.
	 * @param ctx the parse tree
	 */
	void exitThenExpression(grulev3Parser.ThenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(grulev3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(grulev3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(grulev3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(grulev3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOperators(grulev3Parser.MulDivOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#mulDivOperators}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOperators(grulev3Parser.MulDivOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusOperators(grulev3Parser.AddMinusOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#addMinusOperators}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusOperators(grulev3Parser.AddMinusOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(grulev3Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(grulev3Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndLogicOperator(grulev3Parser.AndLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#andLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndLogicOperator(grulev3Parser.AndLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrLogicOperator(grulev3Parser.OrLogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#orLogicOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrLogicOperator(grulev3Parser.OrLogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(grulev3Parser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(grulev3Parser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(grulev3Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(grulev3Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(grulev3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(grulev3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void enterArrayMapSelector(grulev3Parser.ArrayMapSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#arrayMapSelector}.
	 * @param ctx the parse tree
	 */
	void exitArrayMapSelector(grulev3Parser.ArrayMapSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void enterMemberVariable(grulev3Parser.MemberVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#memberVariable}.
	 * @param ctx the parse tree
	 */
	void exitMemberVariable(grulev3Parser.MemberVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(grulev3Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(grulev3Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(grulev3Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(grulev3Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(grulev3Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(grulev3Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(grulev3Parser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(grulev3Parser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalFloatLiteral(grulev3Parser.DecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#decimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalFloatLiteral(grulev3Parser.DecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalFloatLiteral(grulev3Parser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#hexadecimalFloatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalFloatLiteral(grulev3Parser.HexadecimalFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(grulev3Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(grulev3Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(grulev3Parser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(grulev3Parser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(grulev3Parser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(grulev3Parser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(grulev3Parser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(grulev3Parser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(grulev3Parser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(grulev3Parser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grulev3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(grulev3Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grulev3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(grulev3Parser.BooleanLiteralContext ctx);
}