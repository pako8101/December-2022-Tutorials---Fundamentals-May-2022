package ProgrammingFundamentalsWithJavaMай2022.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double high = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * high;
            if (volume > max) {
                max = volume;
                maxModel = model;
            }

        }System.out.print(maxModel);
    }
}

