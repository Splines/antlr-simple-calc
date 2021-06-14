// Generated from C:/SAPDevelop/Antlr-Simple-Calc/src/main/antlr4\Calc.g4 by ANTLR 4.9.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(CalcParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(CalcParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#numberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(CalcParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#numericNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericNode(CalcParser.NumericNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(CalcParser.UnaryMinusContext ctx);
}