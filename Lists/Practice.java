package ProgrammingFundamentalsWithJavaMай2022.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String>items = Arrays.stream(input.split(" ")).
                collect(Collectors.toList());

        List<Integer>numbersList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numbersList.add(Integer.parseInt(items.get(i)));
        }
        System.out.println();
        }
        }




