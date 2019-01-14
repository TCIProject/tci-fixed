package model;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * This is a Book model class to serialize it JSON
 */
public class Movie extends Item {
    private String director;
    private ArrayList<String> writers;
    private ArrayList<String> stars;

    /**
     * Constructor for the Movie model
     * @param id
     * @param depth
     * @param pagesVisited
     * @param timeElapsed
     * @param title
     * @param category
     */
    public Movie(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        super(id, depth, pagesVisited, timeElapsed, title, category);
    }

//    public Movie(int id, String title, Category category, String genre, String format, int year, String director, ArrayList<String> writers, ArrayList<String> stars) {
//        super(id, title,category,genre,format,year);
//        this.director = director;
//        this.writers = writers;
//        this.stars = stars;
//    }

//    public Movie() {
//    }

    /**
     * Setters for the parameters
     * @param
     */
    public void setDirector(String director) {
        this.director = director;
    }

    public void setWriters(ArrayList<String> writers) {
        this.writers = writers;
    }

    public void setStars(ArrayList<String> stars) {
        this.stars = stars;
    }

    /**
     * Getters for retrieving the values inside the parameters
     * @return
     */
    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Movie.class);
    }

//    public String getDirector() {
//        return director;
//    }

//    public ArrayList<String> getWriters() {
//        return writers;
//    }

//    public ArrayList<String> getStars() {
//        return stars;
//    }
}