
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Simple Command-Line Calculator ---");

        // 1. Get the first number
        System.out.print("Enter the first number (operand 1): ");
        double num1 = scanner.nextDouble();

        // 2. Get the second number
        System.out.print("Enter the second number (operand 2): ");
        double num2 = scanner.nextDouble();

        // 3. Get the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        Calculator calc = new Calculator();
        double result = 0;
        boolean validOperation = true;

        // 4. Perform calculation based on input
        switch (operation) {
            case "+":
                result = calc.add(num1, num2);
                break;
            case "-":
                result = calc.subtract(num1, num2);
                break;
            case "*":
                result = calc.multiply(num1, num2);
                break;
            case "/":
                try {
                    result = calc.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println("Calculation Failed: " + e.getMessage());
                    return; // Exit if division by zero occurs
                }
                break;
            default:
                System.out.println("Error: Invalid operation entered. Please use +, -, *, or /.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("\n====================================");
            System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
            System.out.println("====================================");
        }

        scanner.close();
    }
}