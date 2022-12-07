package ProgrammingFundamentalsWithJavaMай2022.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = Arrays. stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        double[] numDouble = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        String input = scanner.nextLine();
        String[] arrStrings = input.split(" ");
       int[] numbersArr = new int[arrStrings.length];
        for (int i = 0; i < arrStrings.length ; i++) {
            numbersArr[i] = Integer.parseInt(arrStrings[i]);

        }System.out.println();

    }
}