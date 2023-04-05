import java.util.Scanner;

public class MultiplicationAnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.println("Enter Any Number to see Multiplication Table");
        int multi =scanner.nextInt();
        //As per User input Printing timetable from 1 to 12
        for (int i=1;i<=12;i++)
        {
            System.out.println(multi+"*"+i+"="+multi*i);
        }
    }
}
