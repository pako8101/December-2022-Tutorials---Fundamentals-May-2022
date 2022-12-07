package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printChar(symbol1, symbol2);

    }

    public static void printChar(char a, char b) {
        for (char i = a; i < b; i++) {
            if (i != a) {
                System.out.println(i);
            }

        }
    }
}