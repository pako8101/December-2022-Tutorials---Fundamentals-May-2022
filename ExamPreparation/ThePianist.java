package ProgrammingFundamentalsWithJavaMай2022.ExamPreparation;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieceMAp = new LinkedHashMap<>();
        for (int piece = 1; piece <= numberOfPieces; piece++) {
            String pieceData = scanner.nextLine();
            String[] piecePArt = pieceData.split("\\|");
            String pieceName = piecePArt[0];
            String composer = piecePArt[1];
            String tone = piecePArt[2];
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(tone);

            pieceMAp.put(pieceName, pieceInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];

                if (pieceMAp.containsKey(pieceName)) {
                    System.out.println(pieceName + "is already in the collection!");
                } else {
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(tone);

                    pieceMAp.put(pieceName, info);
                    System.out.printf("%s by %s in %s added to the collection!", pieceName, composer, tone);
                }
            } else if (command.contains("Remove")) {
                String removedPiece = command.split("\\|")[1];
                if (pieceMAp.containsKey(removedPiece)) {
                    pieceMAp.remove(removedPiece);
                    System.out.printf("Succesafully removed %s !%n", removedPiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.", removedPiece);
                }
            } else if (command.contains("ChangeKey")) {
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];
                if (!pieceMAp.containsKey(pieceName)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.", pieceName);

                } else {
                    List<String> currentInfo = pieceMAp.get(pieceName);
                    currentInfo.remove(1);
                    currentInfo.add(newTone);
                    pieceMAp.put(pieceName, currentInfo);
                    System.out.printf("Changed the key of %s to %s!", pieceName, newTone);
                }

            }
            command = scanner.nextLine();

        }
        pieceMAp.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key %s%n",
                        entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }

}
