package model;

/**
 * This is a movie model class to serialize it JSON
 */

import com.google.gson.Gson;

/**
 * This is a movie model class to serialize it JSON
 */
public class Music extends Item {
    private String artist;

//    public Music(int id, String title, Category category, String genre, String format, int year, String artist) {
//        super(id, title,category,genre,format,year);
//        this.artist = artist;
//    }

    public Music(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        super(id, depth, pagesVisited, timeElapsed, title, category);
    }

//    public Music() {
//    }

    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Music.class);
    }

//    public String getArtist() {
//        return artist;
//    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}