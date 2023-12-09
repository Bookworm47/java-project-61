package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class ProgressionGame {
    private static final int ROUNDS = 3;
    private static final String[][] PROGRESSIONGAMEQNA = new String[ROUNDS][2];

    public static void arithmeticProgression() {
        int question = 0;
        int answer = 1;
        final int progressionLength = 10;
        String[] stringProgression;
        int correctResult;
        int[] progression = new int[progressionLength];
        final int rangeOfFirstProgressionNumber = 100;
        final int randSecNumPos = 10;
        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            progression[0] = Utils.randomNumber(rangeOfFirstProgressionNumber);
            int secretNumberPosition = Utils.randomNumber(randSecNumPos);
            for (int j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + secretNumberPosition;
            }
            correctResult = progression[secretNumberPosition];
            stringProgression = Arrays.toString(progression).split(", ");
            stringProgression[secretNumberPosition] = "..";
            PROGRESSIONGAMEQNA[i][question] = Arrays.toString(stringProgression).
                    replaceAll("[,\\[\\]]", "") + "\n";
            PROGRESSIONGAMEQNA[i][answer] = Integer.toString(correctResult);
        }
        String progressionQuestion = "What number is missing in the progression?";
        Engine.gameEngine(progressionQuestion, PROGRESSIONGAMEQNA);
    }
}
