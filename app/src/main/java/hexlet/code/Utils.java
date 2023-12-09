package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int RANDOMRANGE = 100;
    private static final Random RN = new Random();

    public static int randomNumber(int a) {
        return RN.nextInt(a);
    }
}
