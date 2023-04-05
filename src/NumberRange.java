import java.util.Scanner;

public class NumberRange {
    public void rangeNumber() {
        //Getting User Input and storing In N1 and N2 Variable with int dataType
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter First Positive Number");
        int n1 = scanner.nextInt();
        System.out.println("please Enter Second Positive Number");
        int n2 = scanner.nextInt();
        //user input putting in for loop and printing range of number
        for (n1 = n1; n1 <= n2; n1++)
        {
            System.out.println("\n" + n1);
        }
    }

    public static void main(String[] args) {
        //Creating class Object to call non-static method in static area
        NumberRange numberRange = new NumberRange();
        //calling method using class object
        numberRange.rangeNumber();
    }
}
