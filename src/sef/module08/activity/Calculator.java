package sef.module08.activity;
public class Calculator {

    // Method overloading for integers
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    // Method overloading for decimals
    public double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0.0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
