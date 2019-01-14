package model;

/**
 * This class is a abstract class which will
 * contain items of Movie and Music and Tree
 */
public class Item {
    private int id;
    private String title;
    private Category category;
    private String genre;
    private String format;
    private int year;

    public Item(int id, String title, Category category, String genre, String format, int year) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.genre = genre;
        this.format = format;
        this.year = year;
    }

    public Item(int id, String title, Category category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public Item() {}

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
