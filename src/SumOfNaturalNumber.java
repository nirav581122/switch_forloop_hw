import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Any number ");
        int number = scanner.nextInt();
        int i, sum = 0;
        //Natural number sum
        for (i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("sum of " + number + " is: " + sum);
    }
}
