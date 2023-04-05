import java.util.Scanner;

public class Calculator {
    public void calculation() {
        //User Input as a Scanner Class
        Scanner scanner = new Scanner(System.in);
        //User Input first number and storing in num1
        System.out.println("Please enter the First Number");
        double num1 = scanner.nextDouble();
        //User Input second number and storing in num2
        System.out.println("Please enter the Second Number");
        double num2 = scanner.nextDouble();
        //User Input an operator -and it will store in operator variable
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        //checking with switch condition which case is matching with requirement and printing the answer
        switch (operator) {
            case '+':
                System.out.println("The sum of two number is:" + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference between the two numbers: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product of the two numbers: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result of the division: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }

    public static void main(String[] args) {
        //Creating class object to call non-static method in static area
        Calculator calculator = new Calculator();
        //calling method using class object
        calculator.calculation();

    }
}
