package com.calculator;

import java.util.Scanner;
import com.calculator.operations.ScientificOperations;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Scientific Calculator!");

        while (true) {
            System.out.print("Enter a calculation (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            try {
                double result = calculate(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static double calculate(String input) {
        String[] tokens = input.trim().split("\\s+");
        double result = 0;
        switch (tokens[0].toLowerCase()) {
            case "add":
                result = ScientificOperations.add(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                break;
            case "subtract":
                result = ScientificOperations.subtract(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                break;
            case "multiply":
                result = ScientificOperations.multiply(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                break;
            case "divide":
                result = ScientificOperations.divide(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                break;
            case "sin":
                result = ScientificOperations.sin(Double.parseDouble(tokens[1]));
                break;
            case "cos":
                result = ScientificOperations.cos(Double.parseDouble(tokens[1]));
                break;
            case "tan":
                result = ScientificOperations.tan(Double.parseDouble(tokens[1]));
                break;
            case "log":
                result = ScientificOperations.log(Double.parseDouble(tokens[1]));
                break;
            case "sqrt":
                result = ScientificOperations.sqrt(Double.parseDouble(tokens[1]));
                break;
            case "pow":
                result = ScientificOperations.pow(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                break;
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
        return result;
    }

    public static boolean isValidInput(String input) {
        if (input == null || input.trim().isEmpty()) return false;
        String[] tokens = input.trim().split("\\s+");
        String op = tokens[0].toLowerCase();
        switch (op) {
            case "add":
            case "subtract":
            case "multiply":
            case "divide":
            case "pow":
                return tokens.length == 3;
            case "sin":
            case "cos":
            case "tan":
            case "log":
            case "sqrt":
                return tokens.length == 2;
            default:
                return false;
        }
    }
}