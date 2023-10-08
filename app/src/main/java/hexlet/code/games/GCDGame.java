package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCDGame {
    private static int num1 = 0;
    private static int num2 = 0;
    public static void gcdGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Engine.getAnswerCount(); i++) {
            int correctResult = getGCD();
            System.out.format("Question: %d %d\n", num1, num2);
            int userResult = sc.nextInt();
            Engine.answerCorrectOrNot(userResult, correctResult, userName);
        }
        System.out.format("Congratulations, %s!", userName);
    }

    static int getGCD() {
        final int randomRange = 100;
        num1 = Engine.randomNumber(randomRange);
        num2 = Engine.randomNumber(randomRange);
        return Engine.gcd(num1, num2);
    }
}
