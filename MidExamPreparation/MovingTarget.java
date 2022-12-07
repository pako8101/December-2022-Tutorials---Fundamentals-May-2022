package ProgrammingFundamentalsWithJavaMай2022.MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);
            int value = Integer.parseInt(commandLine[2]);
            switch (command) {
                case "Shoot":
                    if (validIndex(targetList, index)) {
                        int currentNum = targetList.get(index);
                        currentNum = currentNum - value;
                        if (currentNum <= 0) {
                            targetList.remove(index);
                        } else {
                            targetList.set(index, currentNum);
                        }

                    }
                    break;
                case "Add":
                    if (validIndex(targetList, index)) {
                        targetList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validIndexRadius = targetList.size() - 1 >= index
                            && targetList.size() - 1 >= index + value
                            && index - value >= 0;
                    if (validIndexRadius) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetList.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
            List<String> resulList = new ArrayList<>();
            for (int target: targetList
                 ) {
                resulList. add(String.valueOf(target));
            }
            System.out.println(String.join("|", resulList));
            }


    public static boolean validIndex(List<Integer>list, int index){
        return index <= list.size()-1 && index >=0;

    }
}
