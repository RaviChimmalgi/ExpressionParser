/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ravi
 */
public class ExpressionParserTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ExpressionParser parser = new ExpressionParser();

        parser.testAddition();
        parser.testBitwiseAnd();
        parser.testBitwiseComplement();
        parser.testBitwiseExclusiveOr();
        parser.testBitwiseInclusiveOr();
        parser.testDivision();
        parser.testModulus();
        parser.testMultiplication();
        parser.testSubtraction();

    }

}
