import java.util.Scanner;

public class PrimeOrNot {
    public void primeNumber() {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number");
        int number = scanner.nextInt();
        boolean flag = true;
        int rem;
        //
        for (int i = 2; i < number; i++) {
            //storing the answer in rem variable
            rem = number % i;
            //checking that rem is equivalent to zero or not
            if (rem == 0)
                flag = false;
        }
        if (flag == true) {
            System.out.println("This Is prime number");
        } else {
            System.out.println("Is not prime Number");
        }
    }

    public static void main(String[] args) {
        //Creating class object to call non-static method in static area
        PrimeOrNot primeOrNot = new PrimeOrNot();
        //calling method using class object
        primeOrNot.primeNumber();
    }
}
