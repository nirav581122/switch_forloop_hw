public class DividedBy3And5 {
    public static void main(String[] args){
        System.out.print("\nDivided by 3: ");
        //checking  1 to 100 with for loop which number can be divided with 3
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }
        System.out.print("\n\nDivided by 5: ");
        //checking  1 to 100 with for loop which number can be divided with 5
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.print("\n\nDivided by 3 & 5: ");
        //checking  1 to 100 with for loop which number can be divided with 3 and 5
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}
