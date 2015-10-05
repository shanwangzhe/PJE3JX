package fr.univ_lille1.pje.pje3jx;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private static List<Book> list = new ArrayList<Book>();

    public static List<Book> getBooks() {
        if(list.isEmpty())
            fillWithExamples();
        return list;
    }

    public static void addBook(Book b) {
        if(list.isEmpty())
            fillWithExamples();
        list.add(b);
    }

    public static void deleteBook(Book b) {
        if(list.isEmpty())
            fillWithExamples();
        list.remove(b);
    }

    public static void fillWithExamples() {
        list.add(
                new Book(
                        "Tintin en Chine",
                        "Hergé",
                        "tintin.png",
                        "BD humour"
                )
        );
        list.add(
                new Book(
                        "Cuisiner la morue",
                        "Manuel Delaveiro",
                        "morue.png",
                        "Cuisine"
                )
        );
        list.add(
                new Book(
                        "Android pour les nuls",
                        "Mark Truite",
                        "android.png",
                        "Technologie"
                )
        );
    }
}
