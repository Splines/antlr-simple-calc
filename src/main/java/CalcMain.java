
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class CalcMain {

    public static void main(String[] args) throws Exception {
        // create input stream
        CharStream input = CharStreams.fromFileName("src/main/antlr4/Calc.txt");

        // create lexer
        compiler.CalcLexer lexer = new compiler.CalcLexer(input);

        // create token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create parser
        compiler.CalcParser parser = new compiler.CalcParser(tokens);
        parser.setBuildParseTree(true);

        // build parse tree
        ParseTree tree = parser.sum();

        // output parse tree
        System.out.println(tree.toStringTree(parser));

        // visit tree
        CalcVisitor calcVisitor = new CalcVisitor();
        Double result = calcVisitor.visit(tree);
        System.out.println(result);
    }

}
