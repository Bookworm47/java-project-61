package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final String[][] EVENGAMEQNA = new String[3][2];

    public static void evenGame() {
        int question = 0;
        int answer = 1;
        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            int randomNumber = Utils.randomNumber(Utils.RANDOMRANGE);
            EVENGAMEQNA[i][question] = Integer.toString(randomNumber);
            EVENGAMEQNA[i][answer] = isEven(randomNumber) ? "yes" : "no";
        }
        String evenQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.gameEngine(evenQuestion, EVENGAMEQNA);
    }

    public static boolean isEven(int randomInt) {
        return randomInt % 2 == 0;
    }
}
