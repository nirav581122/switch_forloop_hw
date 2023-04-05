import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Any number ");
        //storing in number variable with int data type
        int number = scanner.nextInt();
        int i, fact = 1;
        //user input putting in for loop and storing that calculation in fact variable
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}