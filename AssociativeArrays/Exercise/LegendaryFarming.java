package ProgrammingFundamentalsWithJavaMай2022.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isWIn = false;
        while (!isWIn) {

            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int current = junk.get(material);
                        junk.put(material, current + quantity);
                    }
                }
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtain!");
                    items.put("shards", items.get("shards") - 250);
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    break;
                }
            }
            if (isWIn) {
                break;
            }
        }

        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
