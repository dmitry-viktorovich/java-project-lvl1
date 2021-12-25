package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = sc.nextInt();
        Engine.startGame(gameNumber);
    }
}
