
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Write your name: ");
        String userInput = scanner.nextLine();
        System.out.println("Hi "+ userInput);
    }
}
