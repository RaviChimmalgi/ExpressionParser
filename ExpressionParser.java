
import java.util.*;
import java.lang.*;
/**
 * A skeleton class for the INT interview programming challenge
 */
public class ExpressionParser
{
    /**
     * Evaluates a mathematical expression and returns the result
     *
     * @param expression String
     * @return boolean
     */
    public int parse(String expression) throws NoSuchElementException
    {
        Scanner scan = new Scanner(expression);

        
        Stack<Integer> stack1 = new Stack<Integer>();

        

        int num1;
        int num2;

        while(scan.hasNext()){
        
           try{

            if(scan.hasNextInt())
               {
                int num = scan.nextInt();
                stack1.push(num);
                //System.out.println("push "+ num);
               }

           else{
                //String str = scan.nextChar();
               //System.out.println("scan "+ scan.next());

                  String str = scan.next();

                    if(str.equals("+")){
                    num1 = stack1.pop();
                   // System.out.println("num1 = "+ num1);
                    num2 = stack1.pop();
                    // System.out.println("num1 = "+ num2);
                    stack1.push(num1+num2);
                }

                   

                   if(str.equals("-")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num2 - num1);
                }

                   if(str.equals("/")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num2 / num1);
                }


                    if(str.equals("*")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num1 * num2);
                }

                   if(str.equals("%")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num2 % num1);
                }

                   if(str.equals("&")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num1 & num2);
                }

                    if(str.equals("^")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num1 ^ num2);
                }

                    if(str.equals("|")){
                    num1 = stack1.pop();
                    num2 = stack1.pop();
                    stack1.push(num1 | num2);
                }
                  
                   if(str.equals("~")){
                    num1 = stack1.pop();
                    
                    stack1.push(~num1);
                }
                   
                }
               

            }
                catch(NoSuchElementException e){
                  System.out.println("empty stacfgdgdfgk");
                }


        }

        //int result = stack1.pop();

         //System.out.println(result);
        return stack1.pop();

    }




   public void testBitwiseComplement()
    {
         System.out.println("16 ~ = "+parse("16 ~"));
    }

    public void testMultiplication()
    {
        System.out.println("2 4 * = "+parse("2 4 *"));
    }

    public void testDivision()
    {
         System.out.println("10 3 / = "+parse("10 3 /"));
    }

    public void testModulus()
    {
        System.out.println("4 3 % = "+parse("4 3 %"));
    }

    public void testAddition()
    {
        System.out.println("7 3 + = "+parse("7 3 +"));
    }

    public void testSubtraction()
    {
        System.out.println("45 3 - = "+parse("45 3 -"));
    }

    public void testBitwiseAnd()
    {
        System.out.println("17 5 & = "+parse("17 5 &"));
    }

    public void testBitwiseExclusiveOr()
    {
       System.out.println("511 56 ^ = "+parse("511 56 ^"));
    }

    public void testBitwiseInclusiveOr()
    {
       System.out.println("42 21 | = "+parse("42 21 |"));
    }



}



