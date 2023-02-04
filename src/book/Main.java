package book;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("Max Kidruk", "Bot", 315));
        library.add(new Book("Max Kidruk", "Nebratni", 180));
        library.add(new Book("Max Kidruk", "Doky svitlo ne zgasne", 225));
        library.add(new Book("Max Kidruk", "Ne ozyrajsya i movchy", 296));

        System.out.println("Sorted books, where pages > 200:");

        library.stream().
                filter(p -> p.getPages() >= 200).
                sorted(Comparator.comparing(Book::getPages)).
                forEach(
                        System.out::println
                );

        System.out.println("\nBooks, where pages < 200:");

        library.stream().
                filter(p -> p.getPages() <= 200).
                forEach(
                        System.out::println
                );
        Book books = new Book() {
            @Override
            public void allBooks() {
                for (Book book : library) {
                    System.out.println(book);
                }
            }
        };
        System.out.println("\nAll books:");
        books.allBooks();
    }
}
