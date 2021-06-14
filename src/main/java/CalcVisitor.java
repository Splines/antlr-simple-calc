import compiler.CalcBaseVisitor;
import compiler.CalcParser;

public class CalcVisitor extends CalcBaseVisitor<Double> {

    @Override
    public Double visitSum(CalcParser.SumContext ctx) {
        Double result = visit(ctx.product(0));
        for (int index = 1; ctx.product(index) != null; index++) {
            result += visit(ctx.product(index));
        }
        return result;
    }

    @Override
    public Double visitProduct(CalcParser.ProductContext ctx) {
        Double result = visit(ctx.numberExpr(0));
        for (int index = 1; ctx.numberExpr(index) != null; index++) {
            result *= visit(ctx.numberExpr(index));
        }
        return result;
    }

    @Override
    public Double visitNumberExpr(CalcParser.NumberExprContext ctx) {
        Double number = visit(ctx.numericNode());
        return ctx.unaryMinus() == null ? number : -number;
    }

    @Override
    public Double visitNumericNode(CalcParser.NumericNodeContext ctx) {
        if (ctx.number() != null) {
            return visit(ctx.number());
        } else {
            return visit(ctx.sum());
        }
    }

    @Override
    public Double visitNumber(CalcParser.NumberContext ctx) {
        if (ctx.PI() != null) {
            return Math.PI;
        } else {
            return Double.parseDouble(ctx.NUMBER().getText());
        }
    }

    @Override
    public Double visitUnaryMinus(CalcParser.UnaryMinusContext ctx) {
        return -1.0;
    }

}
