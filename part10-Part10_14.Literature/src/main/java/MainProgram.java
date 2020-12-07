import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Input the age recoommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            books.add(new Book(title, age));
        }
        System.out.println("");
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
