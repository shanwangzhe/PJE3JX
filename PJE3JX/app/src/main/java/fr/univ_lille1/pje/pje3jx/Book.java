package fr.univ_lille1.pje.pje3jx;

public class Book {

    private String name;
    private String author;
    private String image;
    private String genre;

    public Book(String name, String author, String image, String genre) {
        this.name = name;
        this.author = author;
        this.image = image;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
