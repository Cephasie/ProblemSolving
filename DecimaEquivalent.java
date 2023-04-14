package ProblemSolving;

import java.util.Scanner;

public class DecimaEquivalent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter divisor");
        int divisor = scanner.nextInt();
        int binary = 1101;
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int digit = binary % divisor;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= divisor;
        }

        System.out.println("Decimal equivalent of 1101 is: " + decimal);
    }

}
