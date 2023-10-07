package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeGame {

    public static void primeGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = Engine.randomNumber(10);
            System.out.format("Question: %d\n", randomNumber);
            String userResult = sc.nextLine();
            boolean correctResult = isPrime(randomNumber);
            if (userResult.equals("yes") && correctResult || userResult.equals("no") && !correctResult) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = userResult.equals("yes") ? "no" : "yes";
                System.out.format("Your answer: %s\n'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!", userResult, userResult, correctAnswer, userName);
                System.exit(0);
            }
        }
        System.out.format("Congratulations, %s!", userName);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
