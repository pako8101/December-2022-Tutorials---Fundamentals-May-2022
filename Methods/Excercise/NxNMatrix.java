package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPrint = Integer.parseInt(scanner.nextLine());
        NxN(numPrint);
    }

    public static void NxN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");

            }
            System.out.println();
        }
    }
}