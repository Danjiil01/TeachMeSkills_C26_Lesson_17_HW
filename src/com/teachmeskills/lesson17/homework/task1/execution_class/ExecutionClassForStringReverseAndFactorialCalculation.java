package com.teachmeskills.lesson17.homework.task1.execution_class;

import java.util.Scanner;

public class ExecutionClassForStringReverseAndFactorialCalculation {
    static Scanner scanner = new Scanner(System.in);

    public static void execute() {
        System.out.println("Enter 1 for string reverse or 2 for factorial calculation:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                processString();
                break;
            case 2:
                processFactorial();
                break;
            default:
                System.out.println("Invalid input");
        }

        scanner.close();
    }

    private static void processString() {
        System.out.println("Enter string for reverse:");
        scanner.nextLine(); // Consume the newline
        String inputString = scanner.nextLine();
        String result = new StringBuilder(inputString).reverse().toString();
        System.out.println("Result: " + result);
    }

    private static void processFactorial() {
        System.out.println("Enter number for factorial calculation:");
        int inputNumber = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }
}
