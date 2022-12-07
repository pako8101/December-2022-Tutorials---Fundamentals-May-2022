package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleChar(input);
    }

    public static void middleChar(String input) {
        input.toCharArray();
        if (input.length() % 2 == 1) {
            int middle = input.length() / 2;
            System.out.println(input.charAt(middle));
        } else  {
            int indexFirst = input.length() / 2 - 1;
                    int indexSecond = input.length() /2 ;
            System.out.println(input.charAt(indexFirst) + "" + input.charAt(indexSecond));
        }
    }
}
