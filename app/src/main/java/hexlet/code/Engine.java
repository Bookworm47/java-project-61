package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ANSWERCOUNT = 3;

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

    public static void answerCorrectOrNot(String userResult, String correctResult, String userName) {
        if (userResult.equals(correctResult)) {
            System.out.println("Correct!");
        } else {
            System.out.format("Your answer: %s\n'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!", userResult, userResult, correctResult, userName);
            System.exit(0);
        }
    }

    public static void gameEngine(String rules, String[][] qna) {
        String userName = greet();
        Scanner sc = new Scanner(System.in);
        System.out.println(rules);
        int question = 0;
        int answer = 1;

        for (int i = 0; i < Engine.ANSWERCOUNT; i++) {
            System.out.println("Question: " + qna[i][question]);
            System.out.print("Your answer: ");
            String userResult = sc.nextLine();
            answerCorrectOrNot(userResult, qna[i][answer], userName);
        }
        System.out.format("Congratulations, %s!", userName);
    }

}
