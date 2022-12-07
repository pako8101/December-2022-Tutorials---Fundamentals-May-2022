package ProgrammingFundamentalsWithJavaMай2022.Methods;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        int result = getMultipleOfEvensAdnOdds(numInput);
        System.out.println(Math.abs(result));
    }

    public static int getMultipleOfEvensAdnOdds(int n) {
        int result = 1;
        int evenSum = getEvenSum(n);
        int oddsSum = getOddsSum(n);
        result = evenSum * oddsSum;
        return result;
    }
    private static int getEvenSum(int n) {
        int evensSum = 0;
        while (n != 0){
            int digits= n % 10;
        if (digits % 2 == 0) {
            evensSum += digits;
        }
        n /= 10;
        }
        return evensSum;
    }

    private static int getOddsSum(int n) {
        int oddsSum = 0;
        while (n != 0) {
            int digits = n % 10;
            if (digits % 2 == 1) {
                oddsSum += digits;
            }
            n /= 10;
        }
        return oddsSum;

    }
}
