package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class CalcGame {
    static int num1 = 0;
    static int num2 = 0;
    static int correctResult = 0;
    static char operand = '*';
    public static void calcGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            correctAnswer();
            System.out.format("Question: %d %s %d\n", num1, operand, num2);
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

    static void correctAnswer() {
        int operandRn = (int) (Math.random() * 3) + 1;
        num1 = Engine.randomNumber(10);
        num2 = Engine.randomNumber(10);
        switch (operandRn) {
            case 1:
            default:
                correctResult = num1 + num2;
                operand = '+';
                break;
            case 2:
                correctResult = num1 - num2;
                operand = '-';
                break;
            case 3:
                correctResult = num1 * num2;
                operand = '*';
                break;
        }
    }
}
