import java.util.Scanner;

public class TotalNumberOfA {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Any Sentence to find how many 'a' in this sentense ");
        String string = scanner.nextLine();
        //From total string length replacing 'a' with empty string and getting length,which is showing answer
        int a = string.length() - string.replaceAll("a", "").length();
        System.out.println(a);
    }
}
