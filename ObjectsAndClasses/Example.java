package ProgrammingFundamentalsWithJavaMай2022.ObjectsAndClasses;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(99);

        System.out.println(num);
    }
}
