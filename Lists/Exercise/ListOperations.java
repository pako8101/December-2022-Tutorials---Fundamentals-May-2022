package ProgrammingFundamentalsWithJavaMай2022.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(command.split(" ")[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    // int indexToRemove = Integer.parseInt(commandLine.split(" ")[1])
                    int numToRemove = Integer.parseInt(command.split(" ")[1]);
                    if (isIndexValid(numToRemove, numbersList.size())) {
                        numbersList.remove(numToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift left":
                    //int countLeft = Integer.parseInt(commandLine.split(" ")[2]);
                    int shiftLeft = Integer.parseInt(command.split(" ")[2]);;
                    for (int time = 0; time <= shiftLeft; time++) {
                        int firstNum = numbersList.get(0);
                        numbersList.add(firstNum);
                        numbersList.remove(0);
                    }
                    break;
                case "Shift right":
                    int shiftRight = Integer.parseInt(command.split(" ")[2]);
                    for (int time = 1; time <= shiftRight; time++) {
                        int lastNum = numbersList.get(numbersList.size() - 1);
                        numbersList.add(0, lastNum);
                        numbersList.remove(numbersList.size() - 1);
                    }
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                    int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                    if (isIndexValid(indexToInsert, numbersList.size())) {
                        numbersList.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
            }
                command = scanner.nextLine();

            }
            for (int number : numbersList
            ) {
                System.out.print(number + " ");
            }
        }
    public static boolean isIndexValid(int index, int sizeOfList) {
            return index >= 0 && index <= sizeOfList - 1;
    }
}
