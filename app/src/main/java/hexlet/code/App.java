package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner sc = new Scanner(System.in);
        int startNumber = sc.nextInt();
        System.out.println("Your choice: " + startNumber + "\n");

        switch (startNumber) {
            case 0:
            default:
                System.exit(0);
            case 1:
                Engine.greet();
                break;
            case 2:
                EvenGame.evenGame();
                break;
            case 3:
                CalcGame.calcGame();
                break;
            case 4:
                GCDGame.gcdGame();
                break;
            case 5:
                ProgressionGame.arithmeticProgression();
                break;
            case 6:
                PrimeGame.primeGame();
                break;
        }
        sc.close();
    }
}

