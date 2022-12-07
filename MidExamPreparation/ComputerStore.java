package ProgrammingFundamentalsWithJavaMай2022.MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalPrice = 0.0;
        while (!command.equals("special") && !command.equals("regular")) {
            double priceWithoutTax = Double.parseDouble(command);
            if (priceWithoutTax < 0) {
                System.out.println("Invalid price");
                command = scanner.nextLine();
                continue;
            }
            totalPrice += priceWithoutTax;
            command = scanner.nextLine();
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulation you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", totalPrice);
            double taxes = totalPrice * 0.2;
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("___________");
            double sumWithTax = totalPrice + taxes;

            if (command.equals("special")) {
                sumWithTax *= 0.9;
            }
            System.out.printf("Total price: %.2f$\n", sumWithTax);

        }

    }
}
