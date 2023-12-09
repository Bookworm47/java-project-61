package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    private static final int ROUNDS = 3;
    private static final String[] OPERATORS = new String[]{"+", "-", "*"};
    private static final String[][] CALCGAMEQNA = new String[ROUNDS][2];

    public static void calcGame() {
        int question = 0;
        int answer = 1;
        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            final int operandNumber = 3;
            int operandRn = (int) (Math.random() * operandNumber);
            int num1 = Utils.randomNumber(Utils.RANDOMRANGE);
            int num2 = Utils.randomNumber(Utils.RANDOMRANGE);
            int correctResult = calculate(num1, num2, OPERATORS[operandRn]);
            CALCGAMEQNA[i][question] = num1 + " " + OPERATORS[operandRn] + " " + num2;
            CALCGAMEQNA[i][answer] = Integer.toString(correctResult);
        }
        String calcQuestion = "What is the result of the expression?";
        Engine.gameEngine(calcQuestion, CALCGAMEQNA);
    }

    static int calculate(int num1, int num2, String operator) {
        int correctResult = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new RuntimeException("");
        };
        return correctResult;
    }
}
