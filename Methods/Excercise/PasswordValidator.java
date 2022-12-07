package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (!passLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }if (!content(password)) {
            System.out.println("Password must consist only of letters and digits");
        }if (!isValidCountDigit(password)){
            System.out.println("Password must have at least 2 digits");
        }
if (passLength(password)&& content(password)&&isValidCountDigit(password)){
    System.out.println("Password is valid");
}
        }

    private static boolean passLength(String password) {
       /* if (password.length()>=6 && password.length()<= 10){
            return true;
        }else {
            return false;
        }*/
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean content(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigit(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
       /* }if (count>=2){
            return true;
        }else {
            return false;
        }*/
        }
        return count >= 2;

    }
}


