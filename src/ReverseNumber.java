import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //Getting user Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        //storing user input in number Variable
        int number = scanner.nextInt();
        int reverse = 0;
        //converting user number into reverse number
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
