
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = -1;

        while(true){

            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }
            String[]parts = input.split(", ");

            if(parts.length == 2){
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age > oldestAge) {
                    oldestAge = age;

                }
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
