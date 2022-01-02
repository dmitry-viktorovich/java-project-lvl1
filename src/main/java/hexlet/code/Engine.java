package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    static final int ROUNDS = 3;
    static final int GREET = 1;
    static final int EVEN_GAME = 2;
    static final int CALC_GAME = 3;
    static final int GCD_GAME = 4;
    static final int PROGRESSION_GAME = 5;
    static final int PRIME_GAME = 6;
    static final  int EXIT = 0;
    public static int randomizer(int maxRandomNumber) {
        Random random = new Random();
        return random.nextInt(maxRandomNumber);
    }
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return input;
    }
    public static void startGame(int gameNumber) {
        int score = 0;
        String correctAnswer;
        if (gameNumber == EXIT) {
            System.out.println("\nGoodbye!");
        }
        if (gameNumber == GREET) {
            Cli.greetingUser();
        }
        if (gameNumber == EVEN_GAME) {
            Cli.greetingUser();
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            for (int i = 0; i < ROUNDS; i++) {
                Even.even();
                System.out.println("Question: " + Even.getRandomDigit());
                System.out.print("Your answer: ");
                String userAnswer = userInput();
                if (userAnswer.equals(Even.getCorrectAnswer())) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + Even.getCorrectAnswer()
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
            }
        }
        if (gameNumber == CALC_GAME) {
            Cli.greetingUser();
            System.out.println("What is the result of the expression?");
            for (int i = 0; i < ROUNDS; i++) {
                Calc.getRandomOperation();
                System.out.println("Question: " + Calc.getX() + Calc.getOperation() + Calc.getY());
                System.out.print("Your answer: ");
                String userAnswer = userInput();
                if (userAnswer.equals(Calc.getResult())) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + Calc.getResult()
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
            }
        }
        if (gameNumber == GCD_GAME) {
            Cli.greetingUser();
            System.out.println("Find the greatest common divisor of given numbers.");
            GCD gcd = new GCD();
            for (int i = 0; i < ROUNDS; i++) {
                correctAnswer = "" + gcd.getGcd();
                System.out.println("Question: " + gcd.getX() + " " + gcd.getY());
                System.out.print("Your answer: ");
                String userAnswer = userInput();
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
            }
        }
        if (gameNumber == PROGRESSION_GAME) {
            Cli.greetingUser();
            System.out.println("What number is missing in the progression?");
            for (int i = 0; i < ROUNDS; i++) {
                Progression prog = new Progression();
                System.out.println("Question: " + prog.getProgression());
                System.out.print("Your answer: ");
                String userAnswer = userInput();
                if (userAnswer.equals("" + prog.getCorrectAnswer())) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + prog.getCorrectAnswer()
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
            }
        }
        if (gameNumber == PRIME_GAME) {
            Cli.greetingUser();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            for (int i = 0; i < ROUNDS; i++) {
                Prime prime = new Prime();
                System.out.println("Question: " + prime.getQuestion());
                System.out.print("Your answer: ");
                String userAnswer = userInput();
                if (userAnswer.equals(prime.getCorrectAnswer())) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'"
                            + userAnswer
                            + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'"
                            + prime.getCorrectAnswer()
                            + "'"
                            + "\nLet's try again, "
                            + Cli.getUserName()
                            + "!");
                    break;
                }
            }
        }
        if (score == ROUNDS) {
            System.out.println("Congratulations, "
                    + Cli.getUserName()
                    + "!");
        }
    }
}
