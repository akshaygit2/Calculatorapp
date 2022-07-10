package calculatorproject;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorDemo c = new CalculatorDemo();
        Scanner in = new Scanner(System.in);
        int r = 0;
        while (true) {
            System.out.println("Enter first number: ");
            int a = in.nextInt();
            System.out.println("Enter second number:");
            int b = in.nextInt();
            System.out.println("Enter operator:");
            char op = in.next().charAt(0);

            switch (op) {
                case '+':
                    // r = a + b;
                    r = c.add(a, b);
                    System.out.println(r);
                    break;

                case '*':
                    r = c.multiplications(a, b);
                    System.out.println(r);
                    break;

                case '-':
                    r = c.subtract(a, b);
                    System.out.println(r);
                    break;


                case '/':
                    r = c.div(a, b);
                    System.out.println(r);
                    break;

                default:
                    System.out.println("INVALID OPERATOR");
                    System.out.println("Result is: :" + r);
            }
        }
    }
}


