package model;

import com.google.gson.Gson;

/**
 * This is a Music model class to serialize it JSON
 */
public class Music extends Item {
    private String artist;

    /**
     * Constructor for Music model
     * @param id
     * @param depth
     * @param pagesVisited
     * @param timeElapsed
     * @param title
     * @param category
     */
    public Music(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        super(id, depth, pagesVisited, timeElapsed, title, category);
    }

//    public Music(int id, String title, Category category, String genre, String format, int year, String artist) {
//        super(id, title,category,genre,format,year);
//        this.artist = artist;
//    }

//    public Music() {
//    }

    /**
     * Setters for the parameters
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Getters for retrieving the values inside the parameters
     * @return JSON
     */
    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Music.class);
    }

//    public String getArtist() {
//        return artist;
//    }
}