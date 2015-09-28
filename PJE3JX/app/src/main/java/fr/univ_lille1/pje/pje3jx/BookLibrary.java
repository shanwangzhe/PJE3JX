package fr.univ_lille1.pje.pje3jx;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> list;

    public BookLibrary() {
        list.add(
                new Book(
                        "Tintin en Chine",
                        "Hergé",
                        "tintin.png"
                )
        );
        list.add(
                new Book(
                        "Cuisiner la morue",
                        "Manuel Delaveiro",
                        "morue.png"
                )
        );
        list.add(
                new Book(
                        "Android pour les nuls",
                        "Mark Truite",
                        "android.png"
                )
        );
    }

    public ArrayList<Book> getBooks() {
        return list;
    }

    public Book createBook(String name, String author, String image) {
        return new Book(name, author, image);
    }

    public void addBook(Book b) {
        list.add(b);
    }

    public void deleteBook(Book b) {
        list.remove(b);
    }
}
