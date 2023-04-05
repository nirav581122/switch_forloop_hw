import java.util.Scanner;

public class FractionSum {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input any positive number");
        //Storing user input in n variable
        int n = scanner.nextInt();
        int i;
        double sum = 0;
        //with user input getting sum of fraction to n number like 1+1/2+1/3+1/4
        for (i = 1; i <= n; n--) {
            sum = sum + 1.0 / n;
        }
        System.out.println("Sum is %f" + '\t' + sum);
    }
}
