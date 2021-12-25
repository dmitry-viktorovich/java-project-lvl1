package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static String correctAnswer;
    private static int randomDigit;

    public static void even() {
        final int maxRandomNumber = 100;
        randomDigit = Engine.randomizer(maxRandomNumber);
        if (randomDigit % 2 != 0 || randomDigit == 0) {
            correctAnswer = "no";
        } else {
            correctAnswer = "yes";
        }
    }

    public static String getCorrectAmswer() {
        return correctAnswer;
    }

    public static int getRandomDigit() {
        return randomDigit;
    }
}
