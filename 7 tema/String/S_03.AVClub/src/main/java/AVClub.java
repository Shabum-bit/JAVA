
// import jdk.jfr.internal.util.Output;

import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split("\\s+");

            for (String part : parts){
                if (part.contains("av")){
                    System.out.println(part);
                }
            }
        }
    }
}