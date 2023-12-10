package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

import static hexlet.code.Engine.ROUNDS;

public class ProgressionGame {
    private static String progressionQuestion = "What number is missing in the progression?";
    private static final String[][] PROGRESSIONGAMEQNA = new String[ROUNDS][2];

    public static void arithmeticProgression() {
        int question = 0;
        int answer = 1;
        final int progressionLength = 10;
        String[] stringProgression;
        int correctResult;
        final int rangeOfFirstProgressionNumber = 100;
        int firstElement = Utils.randomNumber(rangeOfFirstProgressionNumber);
        final int randSecNumPos = 10;
        int secretNumberPosition = Utils.randomNumber(randSecNumPos);
        final int progressionDifference = Utils.randomNumber(rangeOfFirstProgressionNumber);
        int[] progression = generateProgression(firstElement, progressionDifference, progressionLength);

        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            correctResult = progression[secretNumberPosition];
            stringProgression = Arrays.toString(progression).split(", ");
            stringProgression[secretNumberPosition] = "..";
            PROGRESSIONGAMEQNA[i][question] = Arrays.toString(stringProgression).
                    replaceAll("[,\\[\\]]", "") + "\n";
            PROGRESSIONGAMEQNA[i][answer] = Integer.toString(correctResult);
        }
        Engine.gameEngine(progressionQuestion, PROGRESSIONGAMEQNA);
    }

    private static int[] generateProgression(int firstElement, int difference, int progressionLength) {
        int[] progression = new int[progressionLength];
        progression[0] = firstElement;
        for (int j = 1; j < progressionLength; j++) {
            progression[j] = progression[j - 1] + difference;
        }
        return progression;
    }
}

