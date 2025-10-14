# Scientific Calculator

This project is a scientific calculator application built in Java. It provides various scientific calculation functionalities, including trigonometric functions, logarithms, and exponentiation, aimed at reducing manual effort in academic simulations by 20%.

## Project Structure

```
scientific-calculator
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── calculator
│   │   │   │       ├── CalculatorApp.java
│   │   │   │       ├── operations
│   │   │   │       │   └── ScientificOperations.java
│   │   │   │       └── utils
│   │   │   │           └── InputValidator.java
│   └── test
│       ├── java
│       │   └── com
│       │       └── calculator
│       │           └── CalculatorAppTest.java
├── pom.xml
└── README.md
```

## Features

- **Scientific Calculations**: Perform advanced calculations including trigonometric functions (sin, cos, tan), logarithmic functions (log, ln), and exponentiation.
- **Input Validation**: Ensures that user inputs are valid and meet the required format for calculations.
- **Unit Testing**: Comprehensive tests to ensure the functionality of the application.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd ScientificCalc/scientific-calculator
   ```

2. **Build the Project**:
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   After packaging, run the executable JAR (preferred):
   ```bash
   java -jar target/scientific-calculator-1.0-SNAPSHOT.jar
   ```
   If needed, you can also run directly from compiled classes:
   ```bash
   java -cp target/classes com.calculator.CalculatorApp
   ```

## Usage Guidelines

- Follow the prompts in the application to enter your calculations.
- Use valid input formats as specified in the application to avoid errors.

## Supported Commands and Examples

Input format is space-separated prefix notation: `operation operand1 [operand2]`.

- add a b
   - Description: Addition
   - Example: `add 2 3` -> 5

- subtract a b
   - Description: Subtraction (a - b)
   - Example: `subtract 10 4` -> 6

- multiply a b
   - Description: Multiplication
   - Example: `multiply 7 8` -> 56

- divide a b
   - Description: Division (a / b)
   - Example: `divide 9 3` -> 3
   - Errors: Division by zero throws ArithmeticException

- pow a b
   - Description: Exponentiation (a^b)
   - Example: `pow 2 5` -> 32

- sqrt a
   - Description: Square root of a
   - Example: `sqrt 144` -> 12
   - Errors: Negative input throws ArithmeticException

- log a
   - Description: Base-10 logarithm of a
   - Example: `log 100` -> 2
   - Errors: Non-positive input throws ArithmeticException

- sin a
   - Description: Sine of a degrees
   - Example: `sin 90` -> 1

- cos a
   - Description: Cosine of a degrees
   - Example: `cos 0` -> 1

- tan a
   - Description: Tangent of a degrees
   - Example: `tan 45` -> 1

Notes:
- Angles are interpreted in degrees (internally converted to radians).
- Numbers can be integers or decimals.
- Input must be space-separated; parentheses are not supported.

### Quick demo

Try these after the app starts:

```
add 2 3
subtract 10 7
multiply 6 7
divide 8 2
pow 3 4
sqrt 81
log 1000
sin 30
cos 60
tan 45
```

## License

This project is licensed under the MIT License. See the LICENSE file for more details.