package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD {
    private int x;
    private int y;
    private int result;
    private int gcd(int j, int k) {
        if (k == 0) {
            return j;
        }
        return gcd(k, j % k);
    }

    public int getGcd() {
        final int maxRandomNumber = 50;
        x = Engine.randomizer(maxRandomNumber);
        y = Engine.randomizer(maxRandomNumber);
        result = gcd(x, y);
        return result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
