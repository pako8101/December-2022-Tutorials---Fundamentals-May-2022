package ProgrammingFundamentalsWithJavaMай2022.Arrays.Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String SecondItem: secondArray) {
            for (String firstItem: firstArray) {
                if (firstItem.equals(SecondItem)){
                    System.out.print(firstItem + " ");
                    break;
                }
            }

        }
    }
}
