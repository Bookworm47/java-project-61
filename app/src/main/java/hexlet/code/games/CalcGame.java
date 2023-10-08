package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class CalcGame {
    private static int num1 = 0;
    private static int num2 = 0;
    private static int correctResult = 0;
    private static char operand = '*';
    public static void calcGame() {
        String userName = Engine.greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.getAnswerCount(); i++) {
            calcGameLogic();
            System.out.format("Question: %d %s %d\n", num1, operand, num2);
            System.out.print("Your answer: ");
            int userResult = sc.nextInt();
            Engine.answerCorrectOrNot(userResult, correctResult, userName);
        }
        System.out.format("Congratulations, %s!", userName);
    }

    static void calcGameLogic() {
        final int operandNumber = 3;
        int operandRn = (int) (Math.random() * operandNumber);
        num1 = Engine.randomNumber(Engine.getRandomRange());
        num2 = Engine.randomNumber(Engine.getRandomRange());
        String[] chooseOperand = new String[]{"+", "-", "*"};
        switch (chooseOperand[operandRn]) {
            case "+":
            default:
                correctResult = num1 + num2;
                operand = '+';
                break;
            case "-":
                correctResult = num1 - num2;
                operand = '-';
                break;
            case "*":
                correctResult = num1 * num2;
                operand = '*';
                break;
        }
    }
}
