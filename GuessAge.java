package ProblemSolving;

import java.util.Scanner;

public class GuessAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;
        while (sum == number) {
            if (number == 27) {
                System.out.println("Correct Guess");
            } else {
                System.out.println("Incorrect Guess");
            }

        }
    }
}