
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Write your code here...

        System.out.println("Give a number: ");

        int count = 0;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                break;
            }

            sum += number;
            count++;

            if (number % 2 ==0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Even: " + evenCount);
            System.out.println("Odd: " + oddCount);


    }
}
