import java.util.Scanner;

public class AdditionOfNaturalNumber {
    public void naturalNumber() {
        //User Input as a Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Any number ");
        //user input storing in number
        int number = scanner.nextInt();
        int i, sum = 0;
        //User input putting in for loop to get out sum of it
        for (i = 1; i <= number; i++)
        {
            sum = sum + i;
        }
        System.out.println("sum of " + number + " is: " + sum);
    }
    public static void main(String[] args) {
        //Creating class object to call non-static method in static area
        AdditionOfNaturalNumber additionOfNaturalNumber = new AdditionOfNaturalNumber();
        //calling method using class object
        additionOfNaturalNumber.naturalNumber();
    }
}
