package model;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * This is a book model class to serialize it JSON
 */
public class Book extends Item {
    private ArrayList<String> authors;
    private String publisher;
    private String ISBN;

//    public Book(int id, String title, Category category, String genre, String format, int year, ArrayList<String> authors, String publisher, String ISBN) {
//        super(id, title,category,genre,format,year);
//        this.authors = authors;
//        this.publisher = publisher;
//        this.ISBN = ISBN;
//    }

    public Book(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        super(id, depth, pagesVisited, timeElapsed, title, category);
    }

    public Book() {
    }

    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Book.class);
    }

//    public ArrayList<String> getAuthors() {
//        return authors;
//    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

//    public String getPublisher() {
//        return publisher;
//    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

//    public String getISBN() {
//        return ISBN;
//    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
