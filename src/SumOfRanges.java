import java.util.Scanner;

public class SumOfRanges {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter any Number from 1 to 20");
        int num = scanner.nextInt();
        int sum = 0;
        //user input number to 20 number sum and printing it
        for (int i = num; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.println("The total from " + num + " to 20 is:" + sum);

    }
}
