package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    private static final int ROUNDS = 3;
    private static final String[][] GCDGAMEQNA = new String[ROUNDS][2];

    public static void gcdGame() {
        int question = 0;
        int answer = 1;
        final int randMinRange = 1;
        final int randomRange = 100;
        int num1 = Utils.randomNumber(randomRange) + randMinRange;
        int num2 = Utils.randomNumber(randomRange) + randMinRange;
        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            int gcdResult = gcd(num1, num2);
            GCDGAMEQNA[i][question] = num1 + " " + num2;
            GCDGAMEQNA[i][answer] = Integer.toString(gcdResult);
        }
        String gcdQuestion = "Find the greatest common divisor of given numbers.";
        Engine.gameEngine(gcdQuestion, GCDGAMEQNA);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
