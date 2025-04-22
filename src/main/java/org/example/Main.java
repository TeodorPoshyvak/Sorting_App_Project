package org.example;

import java.util.Arrays;

/**
 * A simple application that accepts up to 10 integer command-line arguments,
 * sorts them in ascending order, and prints the result.
 */
public class Main {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments expected to be integers
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided");
            return;
        }

        if (args.length > 10) {
            System.out.println("Too many numbers provided");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
                return;
            }
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}