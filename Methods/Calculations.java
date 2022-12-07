package ProgrammingFundamentalsWithJavaMай2022.Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actionInput = scanner.nextLine();
        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        switch (actionInput) {
            case "add":
                addNumbers(firstInput, secondInput);
                break;
            case "multiply":
                multiplyNumbers(firstInput, secondInput);
                break;
            case "subtract":
                subtractNumbers(firstInput, secondInput);
                break;
            case "divide":
                divideNumbers(firstInput, secondInput);
                break;

        }
    }

    public static void addNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}