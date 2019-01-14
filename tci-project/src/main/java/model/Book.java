package model;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * This is a Book model class to serialize it JSON
 */
public class Book extends Item {
    private ArrayList<String> authors;
    private String publisher;
    private String ISBN;

    /**
     * Constructor for Book model
     * @param id
     * @param depth
     * @param pagesVisited
     * @param timeElapsed
     * @param title
     * @param category
     */
    public Book(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        super(id, depth, pagesVisited, timeElapsed, title, category);
    }

    public Book() {
    }

//    public Book(int id, String title, Category category, String genre, String format, int year, ArrayList<String> authors, String publisher, String ISBN) {
//        super(id, title,category,genre,format,year);
//        this.authors = authors;
//        this.publisher = publisher;
//        this.ISBN = ISBN;
//    }

    /**
     * Setters for the parameters
     *
     */
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Getter for retrieving the JSON
     * @return JSON
     */
    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Book.class);
    }

//    public ArrayList<String> getAuthors() {
//        return authors;
//    }

//    public String getPublisher() {
//        return publisher;
//    }

//    public String getISBN() {
//        return ISBN;
//    }
}
