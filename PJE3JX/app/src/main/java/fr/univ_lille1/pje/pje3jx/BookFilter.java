package fr.univ_lille1.pje.pje3jx;

/**
 * Created by fan on 15/10/4.
 */
public class BookFilter {
    protected String standard;

    public BookFilter(String standard){
        this.standard = standard;
    }
    public boolean isSelected( Book b){
        switch(standard) {
            case "name":
                if (b.getName() == standard)
                    return true;
                else
                    break;

            case "author":
                if (b.getAuthor() == standard)
                    return true;
                else
                    break;

            case "genre":
                if (b.getGenre() == standard)
                    return true;
                else
                    break;
        }

        return false;
    }
}
