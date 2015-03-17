package nl.stoux.AlgoEnData.H5;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.function.BiFunction;

import static nl.stoux.AlgoEnData.Util.p;

/**
 * Created by Stoux on 17/03/2015.
 */
public class O4 {

    public static void main(String[] args) throws Exception {
        p(berekenPostfix("2 3 4 * + 5 *"));
    }


    public static double berekenPostfix(String s) throws Exception{
        //Parse the string
        StringTokenizer tokenizer = new StringTokenizer(s, " ", false);

        //Create a stack
        Stack<Double> stack = new Stack<>();

        //Loop through tokens
        while(tokenizer.hasMoreElements()) {
            //Get the token
            String token = tokenizer.nextToken();

            //Determine the action to take
            BiFunction<Double, Double, Double> func;
            switch (token) {
                //Check if a operator
                case "*": func = (a,b) -> a * b; break;
                case "+": func = (a,b) -> a + b; break;
                case "-": func = (a,b) -> a - b; break;
                case "/": func = (a,b) -> a / b; break;

                //Otherwise a number
                default:
                    stack.push(Double.parseDouble(token));
                    continue;
            }

            //Execute the operation
            Double a = stack.pop(), b = stack.pop();
            Double c = func.apply(a, b);
            stack.push(c);
        }

        //Check if only one item left
        if (stack.size() != 1) {
            throw new Exception("Invalid Postfix String");
        }

        //Return the result
        return stack.pop();
    }

}
