package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        return randomNumber;
    }

    public static void getUserChoice() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int count = 0;
        String correctAnswer;
        for (int i = 0; i < 3; i++) {
            int randomNumber = getRandomNumber();
            System.out.println("Question: " + randomNumber);
            Scanner sc = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userChoice = sc.nextLine();

            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (userChoice.equals(correctAnswer)) {
                count++;
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                    + userChoice
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
            if (count == 3) {
                System.out.println("Congratulations, "
                    + Cli.getUserName()
                    + "!");
            }
        }
    }
}
