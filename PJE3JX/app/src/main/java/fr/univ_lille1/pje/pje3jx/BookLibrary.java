package fr.univ_lille1.pje.pje3jx;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private List<Book> list;

    public BookLibrary() {
        list = new ArrayList<Book>();
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

    public List<Book> getBooks() {
        return list;
    }

    public Book createBook(String name, String author, String image, String genre) {
        return new Book(name, author, image, genre);
    }

    public void addBook(Book b) {
        list.add(b);
    }

    public void deleteBook(Book b) {
        list.remove(b);
    }
}
