package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int randomizer(int maxRandomNumber) {
        Random random = new Random();
        return random.nextInt(maxRandomNumber);
    }
    public static void startGame(int gameNumber) {
        Cli.greetingUser();
        final int rounds = 3;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progression = 5;
        int score = 0;
        String correctAnswer;
        if (gameNumber == evenGame) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            for (int i = 0; i < rounds; i++) {
                Even.even();
                correctAnswer = "" + Even.getCorrectAnswer();
                System.out.println("Question: " + Even.getRandomDigit());
                Scanner sc = new Scanner(System.in);
                System.out.print("Your answer: ");
                String userAnswer = sc.next();
                if (userAnswer.equals(correctAnswer)) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + correctAnswer
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
                if (score == rounds) {
                    System.out.println("Congratulations, "
                            + Cli.getUserName()
                            + "!");
                }
            }
        }
        if (gameNumber == calcGame) {
            System.out.println("What is the result of the expression?");
            for (int i = 0; i < rounds; i++) {
                Calc.getRandomOperation();
                correctAnswer = "" + Calc.getResult();
                System.out.println("Question: " + Calc.getX() + Calc.getOperation() + Calc.getY());
                Scanner sc = new Scanner(System.in);
                System.out.print("Your answer: ");
                String userAnswer = sc.next();
                if (userAnswer.equals(correctAnswer)) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + correctAnswer
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
                if (score == rounds) {
                    System.out.println("Congratulations, "
                            + Cli.getUserName()
                            + "!");
                }
            }
        }
        if (gameNumber == gcdGame) {
            System.out.println("Find the greatest common divisor of given numbers.");
            GCD gcd = new GCD();
            for (int i = 0; i < rounds; i++) {
                correctAnswer = "" + gcd.getGcd();
                System.out.println("Question: " + gcd.getX() + " " + gcd.getY());
                Scanner sc = new Scanner(System.in);
                System.out.print("Your answer: ");
                String userAnswer = sc.next();
                if (userAnswer.equals(correctAnswer)) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + correctAnswer
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
                if (score == rounds) {
                    System.out.println("Congratulations, "
                            + Cli.getUserName()
                            + "!");
                }
            }
        }
        if (gameNumber == progression) {
            System.out.println("What number is missing in the progression?");
            for (int i = 0; i < rounds; i++) {
                Progression prog = new Progression();
                correctAnswer = "" + prog.getCorrectAnswer();
                System.out.println("Question: " + prog.getProgression());
                Scanner sc = new Scanner(System.in);
                System.out.print("Your answer: ");
                String userAnswer = sc.next();
                if (userAnswer.equals(correctAnswer)) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + correctAnswer
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
                if (score == rounds) {
                    System.out.println("Congratulations, "
                            + Cli.getUserName()
                            + "!");
                }
            }
        }
    }
}
