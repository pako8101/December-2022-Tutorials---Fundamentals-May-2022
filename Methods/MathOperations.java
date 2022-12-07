package ProgrammingFundamentalsWithJavaMай2022.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1Input = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double num2Input = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        double result = calculate(num1Input, operator, num2Input);
        System.out.printf(df.format(result));
    }
    private static double calculate ( double a, String operator, double b){
        double result = 0.0;
        switch (operator){
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;

    }
}
