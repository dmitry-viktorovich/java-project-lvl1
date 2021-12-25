package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static int result;
    private static int x;
    private static int y;
    private static String operation;
    public static void getRandomOperation() {
        final int randomOperationNumber = 3;
        final int randomDigit = 100;
        int randomOperation = Engine.randomizer(randomOperationNumber);
        if (randomOperation == 0) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            operation = " + ";
            result = x + y;
        }
        if (randomOperation == 1) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            operation = " - ";
            result = x - y;
        }
        if (randomOperation == 2) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            operation = " * ";
            result = x * y;
        }
    }

    public static int getResult() {
        return result;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static String getOperation() {
        return operation;
    }
}
