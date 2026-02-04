package sef.module08.activity;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== Console Calculator ===");
        System.out.println("Type 'exit' to quit\n");

        while (true) {

            System.out.print("Enter first number (or exit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Calculator closed. Goodbye!");
                break;
            }

            double firstNumber = Double.parseDouble(input);

            System.out.print("Enter operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            try {
                double result = calculator.calculate(firstNumber, secondNumber, operation);
                System.out.println("Result: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}
