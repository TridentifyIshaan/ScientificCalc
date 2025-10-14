public class InputValidator {

    public boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isValidOperation(String operation) {
        return operation.matches("[+\\-*/^()]");
    }

    public boolean isValidExpression(String expression) {
        // Basic validation for a mathematical expression
        String regex = "^[0-9+\\-*/^().]*$";
        return expression.matches(regex);
    }

    public boolean hasBalancedParentheses(String expression) {
        int balance = 0;
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}