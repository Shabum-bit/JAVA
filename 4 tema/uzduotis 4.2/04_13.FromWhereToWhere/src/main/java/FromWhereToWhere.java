
// import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numberEnd = scanner.nextInt();

        System.out.println("Where from?");
        int numberStart = scanner.nextInt();

        for (int i = numberStart; i <= numberEnd; i++){
            System.out.println(i);
        }
    }
}
