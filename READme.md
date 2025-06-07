# SimpleCalc

## Description
**SimpleCalc** is a basic Java console application that performs fundamental arithmetic operations such as addition, subtraction, multiplication, and division. It features a user-friendly command-line interface where users can input numbers and select operations, displaying the results in real-time.

## Features
- Addition, subtraction, multiplication, division
- Command-line interface for user input
- Displays results immediately
- Handles division by zero gracefully

## How to Build and Run

### Using Java Directly

1. **Navigate to the project directory if not by default:**
   ```sh
   cd /workspaces/ScientificCalc
   ```

2. **Compile the program:**
   ```sh
   javac SimpleCalc.java
   ```

3. **Run the program:**
   ```sh
   java SimpleCalc
   ```

### Usage Example

```
Simple Calculator
Enter first number: 10
Enter operator (+, -, *, /): *
Enter second number: 5
Result: 50.0
Thank you for using Simple Calculator!
```

## Notes
- Enter valid numbers and one of the operators: `+`, `-`, `*`, `/`.
- Division by zero is handled with an error message.