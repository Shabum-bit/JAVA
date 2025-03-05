import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int years = Integer.parseInt(scanner.nextLine());

             books.add(new Book(title, pages, years));

        }
        System.out.println("What will be printed? ");
        String printed = scanner.nextLine();

        if (printed.equals("everything")){
            for (Book book : books){
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            }
        } else if (printed.equals("name")){
            for (Book book : books){
                System.out.println(book.getTitle());
            }
        }
    }
}
