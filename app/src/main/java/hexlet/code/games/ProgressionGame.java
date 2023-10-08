package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class ProgressionGame {
    private static final int PROGRESSIONLENGTH = 10;
    private static String[] stringProgression = new String[PROGRESSIONLENGTH];
    private static int correctResult;
    public static void arithmeticProgression() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.getAnswerCount(); i++) {
            correctResult = progressionLogic();
            System.out.format("Question: " + Arrays.toString(stringProgression).
                    replaceAll("[,\\[\\]]", "") + "\n");
            System.out.print("Your answer: ");
            int userResult = sc.nextInt();
            Engine.answerCorrectOrNot(userResult, correctResult, userName);
        }
        System.out.format("Congratulations, %s!", userName);
    }

    static int progressionLogic() {
        int[] progression = new int[PROGRESSIONLENGTH];
        final int rangeOfFirstProgressionNumber = 100;
        final int randSecNumPos = 10;
        progression[0] = Engine.randomNumber(rangeOfFirstProgressionNumber);
        int secretNumberPosition = Engine.randomNumber(randSecNumPos);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + secretNumberPosition;
        }
        correctResult = progression[secretNumberPosition];
        stringProgression = Arrays.toString(progression).split(", ");
        stringProgression[secretNumberPosition] = "..";
        return correctResult;
    }
}
