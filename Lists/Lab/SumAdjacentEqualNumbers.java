package ProgrammingFundamentalsWithJavaMай2022.Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());
        for (int i = 0; i < numbersList.size()-1; i++) {
            double currentNum = numbersList.get(i);
            double next = numbersList.get(i+1);
            if (currentNum==next){
                numbersList.set(i, currentNum + next);
                numbersList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElements(numbersList," "));
    }
    public static String joinElements(List<Double>list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item:
             list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }return  result;
    }
}
