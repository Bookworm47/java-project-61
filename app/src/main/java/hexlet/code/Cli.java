package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        String userName = "none";
        System.out.println("May i have your name?");
        if (scanner.hasNext()) {
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("You did not say your name, bye!");
        }
    }
}
