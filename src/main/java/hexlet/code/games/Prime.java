package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {
    private String correctAnswer;
    private final int maxRandomNumber = 100;
    private int number = Engine.randomizer(maxRandomNumber);
    private boolean getPrimeNumber(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public String getCorrectAnswer() {
        if (getPrimeNumber(number)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
    public int getQuestion() {
        return number;
    }
}
