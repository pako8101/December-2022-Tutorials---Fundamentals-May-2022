package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        addSubtractNumbers(num1, num2, num3);

    }
    public static void addSubtractNumbers(int a, int b, int c){
        int sum = (a + b) - c;
        System.out.println(sum);
    }
}
