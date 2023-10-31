import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }

            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
    }
}
