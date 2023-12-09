package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    private static final int ROUNDS = 3;
    private static final String[][] PRIMEGAMEQNA = new String[ROUNDS][2];

    public static void primeGame() {
        int question = 0;
        int answer = 1;
        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            int randomNumber = Utils.randomNumber(Utils.RANDOMRANGE);
            String primeNumber = isPrime(randomNumber) ? "yes" : "no";
            PRIMEGAMEQNA[i][question] = Integer.toString(randomNumber);
            PRIMEGAMEQNA[i][answer] = primeNumber;
        }
        String primeQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameEngine(primeQuestion, PRIMEGAMEQNA);
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
