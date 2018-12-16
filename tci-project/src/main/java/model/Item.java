package model;

/**
 * This class is a abstract class which will
 * contain items of Movie and Music and Tree
 */
public abstract class Item {
    private String genre;
    private String format;
    private int date;

    public Item(String genre, String format, int date) {
        this.genre = genre;
        this.format = format;
        this.date = date;
    }

    public Item() {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
