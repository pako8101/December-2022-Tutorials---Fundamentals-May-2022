package ProgrammingFundamentalsWithJavaMай2022.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int current = numbers[index];


            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                if (current > numbers[rightIndex]){

                }System.out.print(rightIndex + " ");
            }
        }

    }
}