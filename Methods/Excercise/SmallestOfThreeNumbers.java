package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        smallestNumbers(number1,number2, number3);
    }
    public static void smallestNumbers (int a, int b, int c){
        if (a >= b && a >= c){
            System.out.println(a);
        } else if (a <= b && b >= c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
