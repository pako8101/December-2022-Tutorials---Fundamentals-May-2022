package ProgrammingFundamentalsWithJavaMай2022.Methods.Excercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        System.out.println(printVowelsCount(input));
    }
    public static int printVowelsCount (String word){
        int count = 0;

        for (char symbol: word.toCharArray()) {
            if (symbol == 'a' || symbol == 'o' ||
                    symbol == 'e' ||symbol == 'i' ||symbol == 'u'){
            count++;
        }

        }
        return count;
    }
}
