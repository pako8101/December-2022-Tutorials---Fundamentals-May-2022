package ProgrammingFundamentalsWithJavaMай2022.AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\|")[1];
                forceBook.putIfAbsent(team,new ArrayList<>());
                /*if (!forceBook.containsKey(team)) {
                    forceBook.put(team, new ArrayList<>());
                }*/
                boolean isExist = false;
                List<String> currentPlayers = forceBook.get(team);
                for (List<String> list : forceBook.values()) {

                    if (!list.contains(player)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    forceBook.get(team).add(player);
                }

            } else if (input.contains("->")) {
                String player = input.split("->")[0];
                String team = input.split("->")[1];

                forceBook.entrySet().forEach(entry -> entry.getValue().remove(player));
                if (forceBook.containsKey(team)) {
                    List<String> currentPlayer = forceBook.get(team);
                    currentPlayer.add(player);
                    forceBook.put(team, currentPlayer);
                } else {
                    forceBook.put(team, new ArrayList<>());
                    forceBook.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }
        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",
                            entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
