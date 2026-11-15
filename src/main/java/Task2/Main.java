package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BookData[] books = {
                new BookData("Кобзар", "Тарас Шевченко", 10, 48.0),             // рейтинг 4.80
                new BookData("Тіні забутих предків", "М. Коцюбинський", 5, 24.5), // рейтинг 4.90
                new BookData("Енеїда", "Іван Котляревський", 10, 48.0),        // рейтинг 4.80 (як у Кобзаря)
                new BookData("Захар Беркут", "Іван Франко", 4, 17.0)           // рейтинг 4.25
        };

        Arrays.sort(books);

        System.out.println("Книги після сортування (від найвищого рейтингу):");
        for (BookData book : books) {
            System.out.println(book);
        }
    }
}