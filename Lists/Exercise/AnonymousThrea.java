package ProgrammingFundamentalsWithJavaMай2022.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThrea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > text.size() - 1) {
                    endIndex = text.size() - 1;
                }
                boolean isValidIndexes = startIndex <= text.size() - 1 && endIndex >= 0 && startIndex > endIndex;
                if (isValidIndexes) {
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentTExt = text.get(index);
                        resultMerge += currentTExt;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        text.remove(startIndex);
                    }
                    text.add(startIndex, resultMerge);

                } else if (command.contains("divide")) {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int parts = Integer.parseInt(command.split(" ")[2]);
                    String elementForDivide = text.get(index);
                    text.remove(index);
                    int partSize = elementForDivide.length() / parts;

                    int beginIndex = 0;
                    for (int part = 1; part < parts; part++) {
                        text.add(index, elementForDivide.substring(beginIndex, beginIndex + partSize));
                        index++;
                        beginIndex += partSize;

                    }
                    text.add(index, elementForDivide.substring(beginIndex, elementForDivide.length()));


                }
            }


            command = scanner.nextLine();
        }
        /*System.out.println(String.join(text + " "));*/
        for (String tex : text
        ) {
            System.out.print(tex + " ");

        }
    }
}
