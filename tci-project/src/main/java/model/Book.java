package model;

/**
 * This is a book model class to serialize it JSON
 */
public class Book implements interfaceModel.Book {
    private String[] authors;
    private String publisher;
    private String ISBN;

    public Book(String[] authors, String publisher, String ISBN) {
        this.authors = authors;
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
