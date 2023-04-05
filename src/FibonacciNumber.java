import java.util.Scanner;

public class FibonacciNumber {
    public void fibonacci() {
        //User Input as a Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Any positive number");
        //Storing Value in Number variable with int data Type
        int number = scanner.nextInt();
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        int n1 = 1, n2 = 1;
        System.out.println(n1 + "\n" + n2);
        //fibonacci result getting with the help of for loop
        for (int i = 2; i < number; i++)
        {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
    public static void main(String[] args) {
        //Creating class object to call non-static method in static area
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        //calling method using class object
        fibonacciNumber.fibonacci();
    }
}
