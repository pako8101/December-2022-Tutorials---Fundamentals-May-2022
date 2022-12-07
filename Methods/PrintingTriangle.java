package ProgrammingFundamentalsWithJavaMай2022.Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPrint = Integer.parseInt(scanner.nextLine());
        triangle(numPrint);
    }
    public  static void triangle(int n){
        for (int i = 0; i <=n  ; i++) {
            printLine(1, i);
        }
        for (int i = n-1; i >= 1 ; i--) {
            printLine(1,i);
        }
    }
    public static void printLine(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
