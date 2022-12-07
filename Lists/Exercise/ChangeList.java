package ProgrammingFundamentalsWithJavaMай2022.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String commandName = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);
            if (commandName.equals("Delete")) {
                numbersList.removeAll(Arrays.asList(element));
            } else if (commandName.equals("Insert")) {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(position, element);
            }

            command = scanner.nextLine();
        }
        for (int number:numbersList
             ) {
            System.out.print(number + " ");

        }
    }
}
