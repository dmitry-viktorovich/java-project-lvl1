package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static int result;

    public static void getRandomOperation() {
        final int randomOperationNumber = 3;
        final int randomDigit = 100;
        int randomOperation = Engine.randomizer(randomOperationNumber);
        String question;
        int x;
        int y;
        if (randomOperation == 0) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            question = "Question: " + x + " + " + y;
            System.out.println(question);
            result = sum(x, y);
        }
        if (randomOperation == 1) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            question = "Question: " + x + " - " + y;
            System.out.println(question);
            result = diff(x, y);
        }
        if (randomOperation == 2) {
            x = Engine.randomizer(randomDigit);
            y = Engine.randomizer(randomDigit);
            question = "Question: " + x + " * " + y;
            System.out.println(question);
            result = multiply(x, y);
        }
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static int diff(int x, int y) {
        return x - y;
    }

    private static int multiply(int x, int y) {
        return x * y;
    }

    public static int getResult() {
        return result;
    }
}
