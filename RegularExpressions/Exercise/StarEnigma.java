package ProgrammingFundamentalsWithJavaMай2022.RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMess = Integer.parseInt(scanner.nextLine());
        String regex = "([\\w]+)[-@!:>]*([\\d])[-@!:>]*+([AD]!)[-@!:>]*->([\\d]+)[-@!:>]*";
        Pattern pattern = Pattern.compile(regex);
        List<String>attackerPlanet = new ArrayList<>();
        List<String>destroyedPlanet = new ArrayList<>();
        for (int messageCount = 1; messageCount <= countMess; messageCount++) {
            String encryptedMess = scanner.nextLine();
            String decryptedMess = getDecryptedMess(encryptedMess);
            Matcher matcher = pattern.matcher(decryptedMess);
            if (matcher.find()) {
                String planetName = matcher.group(1);
                int population = Integer.parseInt(matcher.group(2));
                String attackType = matcher.group(3);
                int soldierCount = Integer.parseInt(matcher.group(4));
                
                if (attackType.equals("A")){
                    attackerPlanet.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanet.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: "+ attackerPlanet.size());
        Collections.sort(attackerPlanet);
        attackerPlanet.forEach(planet-> System.out.println("->" + planet));

        System.out.println("Destroyed planets: "+ destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(planet-> System.out.println("->" + planet));
    }

    private static String getDecryptedMess(String encryptedMess) {
        int countLetters = getSpecialLettersCount(encryptedMess);
        StringBuilder decryptedMess = new StringBuilder();
        for (char symbol : encryptedMess.toCharArray()) {
            char newSymbol = (char) (symbol - countLetters);
            decryptedMess.append(newSymbol);
        }
        return decryptedMess.toString();
    }

    private static int getSpecialLettersCount(String encryptedMess) {
        int count = 0;
        for (char symbol : encryptedMess.toCharArray()) {
            switch (symbol) {
                case 'a':
                case 't':
                case 's':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
