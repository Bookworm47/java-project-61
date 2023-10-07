package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCDGame {
    static int num1 = 0;
    static int num2 = 0;
    static int correctResult;
    public static void gcdGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            getGCD();
            System.out.format("Question: %d %d\n", num1, num2);
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

    static int getGCD() {
        num1 = Engine.randomNumber(100);
        num2 = Engine.randomNumber(100);
        correctResult = Engine.gcd(num1, num2);
        return correctResult;
    }
}
