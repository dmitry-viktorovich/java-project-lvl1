package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetingUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
