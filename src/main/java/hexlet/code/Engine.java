package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
    }
}
