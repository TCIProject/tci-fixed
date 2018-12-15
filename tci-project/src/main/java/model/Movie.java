package model;

public class Movie extends Item {
    private String director;
    private String[] writes;
    private String[] stars;

    public Movie(String genre, String format, int date, String director, String[] writes, String[] stars) {
        super(genre, format, date);
        this.director = director;
        this.writes = writes;
        this.stars = stars;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getWrites() {
        return writes;
    }

    public void setWrites(String[] writes) {
        this.writes = writes;
    }

    public String[] getStars() {
        return stars;
    }

    public void setStars(String[] stars) {
        this.stars = stars;
    }
}
