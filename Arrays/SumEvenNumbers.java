package ProgrammingFundamentalsWithJavaMай2022.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int [] num = Arrays.
                stream(input.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int sum = 0;
        for (int i = 0; i < num.length ; i++) {
            int currentElement = num[i];
            if (currentElement % 2 == 0)
                sum += currentElement;
        }
        System.out.println(sum);
    }
}
