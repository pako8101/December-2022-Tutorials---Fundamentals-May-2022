package ProgrammingFundamentalsWithJavaMай2022.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(#|@)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> pairs = new ArrayList<>();
        int countAll = 0;
        while (matcher.find()) {
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            countAll++;
            StringBuilder secondWordBuilder = new StringBuilder(secondWord);
            String reversedSecondWord = secondWordBuilder.reverse().toString();

            if (firstWord.equals(reversedSecondWord)) {
                pairs.add(firstWord + "<=>" + secondWord);
            }
        }
        if (countAll == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countAll + " word pairs found!");
        }

        if (pairs.size() == 0) {
            System.out.println("No mirror words!");
        } else {

            System.out.println("The mirror words are:" + String.join(", ", pairs));
        }

    }
}
