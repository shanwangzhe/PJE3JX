package fr.univ_lille1.pje.pje3jx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fan on 15/10/4.
 */
public class BookFilterCatalog extends BookFilter{

    private List<Book> list;
    private String standard;

    public BookFilterCatalog(String standard) {
        super(standard);
        BookLibrary library = new BookLibrary();
        List<Book> list_books = library.getBooks();
         for(Book b:list_books)
                {
                   if (isSelected(b)){
                }    list.add(b)  ;
        }

    }

    public List<Book> getBooks() {
        return list;
    }


}
