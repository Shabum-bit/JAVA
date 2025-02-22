
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      System.out.println("Give the first number:");
      int firstNumber = Integer.parseInt(scanner.nextLine());

      System.out.println("Give the second number:");
      int secondnumber = Integer.parseInt(scanner.nextLine());

      int addition = firstNumber + secondnumber;
      int subtraction = firstNumber - secondnumber;
      int multiplication = firstNumber * secondnumber;
      double division = firstNumber / secondnumber;

      System.out.println(firstNumber + " + " + secondnumber + " = " + addition);
      System.out.println(firstNumber + " - " + secondnumber + " = " + subtraction);
      System.out.println(firstNumber + " * " + secondnumber + " = " + multiplication);
      System.out.println(firstNumber + " / " + secondnumber + " = " + division);

    }
}
