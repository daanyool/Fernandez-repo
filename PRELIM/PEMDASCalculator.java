import java.util.*;

public class PEMDASCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String exp = obj.nextLine().replaceAll(" ", "");
        
        double result = calculate(exp);
        
        System.out.println("Result: " + result);
    }
    
    public static double calculate(String exp) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                while (i < exp.length() && (Character.isDigit(exp.charAt(i)) || exp.charAt(i) == '.')) {
                    num.append(exp.charAt(i));
                    i++;
                }
                numbers.push(Double.parseDouble(num.toString()));
                i--;
            } 
            else if (ch == '(') {
                operators.push(ch);
            } 
            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    applyOperator(numbers, operators);
                }
                operators.pop(); 
            } 
            else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    applyOperator(numbers, operators);
                }
                operators.push(ch);
            }
        }
        
        while (!operators.isEmpty()) {
            applyOperator(numbers, operators);
        }
        
        return numbers.pop();
    }
    
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0; 
        }
    }
    
    public static void applyOperator(Stack<Double> numbers, Stack<Character> operators) {
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        char operator = operators.pop();
        
        double result = 0.0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }
        
        numbers.push(result);
    }
}