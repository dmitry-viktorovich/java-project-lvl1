package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {
    private final int minLengthProgression = 5;
    private final int maxLengthProgression = 10;
    private final int minStep = 1;
    private final int maxStep = 5;
    private final int maxStartNumber = 100;
    private int step = Engine.randomizer(maxStep - minStep) + minStep;
    private int start = Engine.randomizer(maxStartNumber);
    private int length = Engine.randomizer(maxLengthProgression - minLengthProgression) + minLengthProgression;
    private int hide = Engine.randomizer(length);
    private int correctAnswer = start + (step + step * hide);
    private String progression(int strt, int lth, int stp, int hd) {
        String progression = "" + start;
        for (int i = 0; i < length; i++) {
            start += step;
            if (i == hide) {
                progression += " ..";
            } else {
                progression += " " + start;
            }
        }
        return progression;
    }
    public String getProgression() {
        String result = progression(start, length, step, hide);
        return result;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
