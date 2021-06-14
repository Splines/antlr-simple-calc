// Generated from C:/SAPDevelop/Antlr-Simple-Calc/src/main/antlr4\Calc.g4 by ANTLR 4.9.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(CalcParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(CalcParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(CalcParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(CalcParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(CalcParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(CalcParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#numericNode}.
	 * @param ctx the parse tree
	 */
	void enterNumericNode(CalcParser.NumericNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#numericNode}.
	 * @param ctx the parse tree
	 */
	void exitNumericNode(CalcParser.NumericNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(CalcParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(CalcParser.UnaryMinusContext ctx);
}