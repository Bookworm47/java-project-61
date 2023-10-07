package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class ProgressionGame {
    static int[] progression = new int[10];
    static String[] stringProgression = new String[10];
    static int correctResult;
    public static void arithmeticProgression() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            progressionLogic();
            System.out.format("Question: " + Arrays.toString(stringProgression).
                    replaceAll("[,\\[\\]]", "") + "\n");
            int userResult = sc.nextInt();
            if (userResult == correctResult) {
                System.out.println("Correct!");
            } else {
                System.out.format("Your answer: %d\n'%d' is wrong answer ;(. Correct answer was '%d'.\n"
                        + "Let's try again, %s!", userResult, userResult, correctResult, userName);
                System.exit(0);
            }
        }
        System.out.format("Congratulations, %s!", userName);
    }

    static int progressionLogic() {
        progression[0] = Engine.randomNumber(100);
        int secretNumberPosition = Engine.randomNumber(10);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + secretNumberPosition;
        }
        correctResult = progression[secretNumberPosition];
        stringProgression = Arrays.toString(progression).split(", ");
        stringProgression[secretNumberPosition] = "..";
        return correctResult;
    }
}
