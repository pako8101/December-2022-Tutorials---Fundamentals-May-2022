package ProgrammingFundamentalsWithJavaMай2022.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int counter = 0;
        int currentCounter = 0;
        String currentSequence = "";
        String sequence = "";
        int element = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (currentCounter > counter) {
                counter = currentCounter;
                sequence = currentSequence + arr[i - 1];
            }
            currentCounter = 0;
            currentSequence = "";
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    currentCounter++;
                    currentSequence += arr[i] + " ";
                } else {
                    break;

                }
            }

        }if (sequence.equals("")) {
            System.out.print(arr[0]);
        }
        System.out.println(sequence);
    }
}
