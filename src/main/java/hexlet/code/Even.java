package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static int getRandomNumber() {
        final int maxRandomNumber = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(maxRandomNumber);
        return randomNumber;
    }

    public static void runEvenGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int countCorrectAnswer = 0;
        final int rounds = 3;
        String correctAnswer;
        for (int i = 0; i < rounds; i++) {
            int questionNumber = getRandomNumber();
            System.out.println("Question: " + questionNumber);
            Scanner sc = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (questionNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (userAnswer.equals(correctAnswer)) {
                countCorrectAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                    + userAnswer
                    + "'"
                    + " is wrong answer ;(. Correct answer was "
                    + "'"
                    + correctAnswer
                    + "'"
                    + "\nLet\'s try again, "
                    + Cli.getUserName()
                    + "!");
                break;
            }
            if (countCorrectAnswer == rounds) {
                System.out.println("Congratulations, "
                    + Cli.getUserName()
                    + "!");
            }
        }
    }
}
