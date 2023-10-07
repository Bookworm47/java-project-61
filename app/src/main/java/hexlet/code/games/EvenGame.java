package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class EvenGame {
    public static void evenGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = Engine.randomNumber(10);
            System.out.println("Question: " + randomNumber);
            String userResult = sc.nextLine();
            if (userResult.equals("yes") || userResult.equals("no")) {
                System.out.println("Your answer:" + userResult);
            } else {
                System.out.println("Incorrect input");
            }
            if (randomNumber % 2 == 0 && userResult.equals("yes")
                    || randomNumber % 2 != 0 && userResult.equals("no")) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = userResult.equals("yes") ? "no" : "yes";
                System.out.format("%s is wrong answer ;(. Correct answer was '%s'.\nLet's try again, Bill!",
                        userResult, correctAnswer);
                System.exit(0);
            }
        }
        System.out.format("Congratulations, %s!", userName);
    }
}
