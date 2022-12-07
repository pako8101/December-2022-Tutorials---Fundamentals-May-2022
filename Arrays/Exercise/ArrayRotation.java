package ProgrammingFundamentalsWithJavaMай2022.Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= n ; rotation++) {

            String firstElement = array[0];
            for (int index = 0; index < array.length-1; index++) {
                array[index] = array[index + 1];
            }
                array[array.length - 1] = firstElement;
            }
            for (String element: array) {
                System.out.print(element + " ");

            }
        }

    }
