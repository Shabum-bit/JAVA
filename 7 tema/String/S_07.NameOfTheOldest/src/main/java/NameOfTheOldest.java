
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalYears = 0;
        int personCount =0;

        while (true){

            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] parts = input.split(", ");

            if (parts.length == 2){
                String name = parts[0];
                int birthYear = Integer.valueOf(parts[1]);

                if (name.length() > longestName.length()){
                    longestName = name;
                }
                totalYears += birthYear;
                personCount++;
            }
        }
        double averageBirthYear = (double) totalYears / personCount;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
