

/**
 * Created by Phil on 11/16/2015.
 */
public class TIOCalc1 {

        public static void main(String[] args){

            double input1;
            double input2;
            double ans;
            String oper;

            System.out.println("-- CALCULATOR --");
            System.out.println("Please enter the first value to process.");
            input1 =TextIO.getDouble();
            System.out.println("Please enter your operator: \"+\", \"-\", \"*\", \"/\"");
            oper = TextIO.getlnWord();
            System.out.println("Please enter the second value to process.");
            input2 = TextIO.getDouble();
            switch(oper) {
                case "+":
                    ans = input1 + input2;
                    break;
                case "-":
                    ans = input1 + input2;
                    break;
                case "*":
                    ans = input1 * input2;
                    break;
                case "/":
                    ans = input1 / input2;
                    break;
                default:
                    System.out.println("Unknown operator. Exiting application.");
                    ans = 0;
                    System.exit(1);
            }

            System.out.println("You've entered: " + input1 + oper + input2);
            System.out.println("");
            System.out.println("The answer is: " + ans);




        }
}
