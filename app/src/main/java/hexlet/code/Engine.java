package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int ANSWERCOUNT = 3;
    private static final int RANDOMRANGE = 100;
    public static int getAnswerCount() {
        return ANSWERCOUNT;
    }
    public static int getRandomRange() {
        return RANDOMRANGE;
    }

    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        String userName = "none";
        System.out.print("May I have your name? ");
        if (scanner.hasNext()) {
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("You did not say your name, bye!");
        }
        return userName;
    }

    public static void answerCorrectOrNot(int userResult, int correctResult, String userName) {
        if (userResult == correctResult) {
            System.out.println("Correct!");
        } else {
            System.out.format("Your answer: %d\n'%d' is wrong answer ;(. Correct answer was '%d'.\n"
                    + "Let's try again, %s!", userResult, userResult, correctResult, userName);
            System.exit(0);
        }
    }

    public static int randomNumber(int a) {
        Random rn = new Random();
        return rn.nextInt(a);
    }

    public static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner sc = new Scanner(System.in);
        String startNumber = sc.nextLine();
        System.out.println("Your choice: " + startNumber + "\n");

        switch (startNumber) {
            case "0":
            default:
                System.exit(0);
            case "1":
                Engine.greet();
                break;
            case "2":
                EvenGame.evenGame();
                break;
            case "3":
                CalcGame.calcGame();
                break;
            case "4":
                GCDGame.gcdGame();
                break;
            case "5":
                ProgressionGame.arithmeticProgression();
                break;
            case "6":
                PrimeGame.primeGame();
                break;
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
