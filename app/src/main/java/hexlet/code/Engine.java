package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

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

    public static int randomNumber(int a) {
        Random rn = new Random();
        return rn.nextInt(a);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
