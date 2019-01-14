package model;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Movie extends Item {
    private String director;
    private ArrayList<String> writers;
    private ArrayList<String> stars;

//    public Movie(int id, String title, Category category, String genre, String format, int year, String director, ArrayList<String> writers, ArrayList<String> stars) {
//        super(id, title,category,genre,format,year);
//        this.director = director;
//        this.writers = writers;
//        this.stars = stars;
//    }

    public Movie(int id, String title, Category category) {
        super(id, title, category);
    }

//    public Movie() {
//    }

    public String getJSON() {
        Gson gson = new Gson();
        return gson.toJson(this, Movie.class);
    }

//    public String getDirector() {
//        return director;
//    }

    public void setDirector(String director) {
        this.director = director;
    }

//    public ArrayList<String> getWriters() {
//        return writers;
//    }

    public void setWriters(ArrayList<String> writers) {
        this.writers = writers;
    }

//    public ArrayList<String> getStars() {
//        return stars;
//    }

    public void setStars(ArrayList<String> stars) {
        this.stars = stars;
    }
}