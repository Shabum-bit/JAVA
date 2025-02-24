import java.util.Scanner;

public class numberOfYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        double minutes = scanner.nextDouble();

        double totalDays = minutes / (24 *60);

        int years = (int)totalDays / 365;
        int remainingDays = (int)totalDays % 365;

        System.out.println((long)minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}