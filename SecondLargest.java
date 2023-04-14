package ProblemSolving;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("enter number of elements ");
                int n = scanner.nextInt();

                int[] array = new int[n];
                System.out.println("Enter elements ");

                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                int max = Integer.MIN_VALUE;
                int secondMax = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    if (array[i] > max) {
                        secondMax = max;
                        max = array[i];
                    } else if (array[i] > secondMax && array[i] != max) {
                        secondMax = array[i];
                    }
                }

                System.out.println("The second largest number is " + secondMax);
            }

    }
