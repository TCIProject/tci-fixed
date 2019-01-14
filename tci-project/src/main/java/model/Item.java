package model;

/**
 * This class is a abstract class which will contain items of Book, Movie and Music
 */
public class Item {
    private int id;
    private int depth;
    private int pagesVisited;
    private long timeElapsed;
    private String title;
    private Category category;
    private String genre;
    private String format;
    private int year;

    public Item(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category) {
        this.id = id;
        this.depth = depth;
        this.pagesVisited = pagesVisited;
        this.timeElapsed = timeElapsed;
        this.title = title;
        this.category = category;
    }

    public Item() {}

    public Item(int id, int depth, int pagesVisited, long timeElapsed, String title, Category category, String genre, String format, int year) {
        this.id = id;
        this.depth = depth;
        this.pagesVisited = pagesVisited;
        this.timeElapsed = timeElapsed;
        this.title = title;
        this.category = category;
        this.genre = genre;
        this.format = format;
        this.year = year;
    }

    /**
     * Setters for the parameters
     * @param
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setPagesVisited(int pagesVisited) {
        this.pagesVisited = pagesVisited;
    }

    public void setTimeElapsed(long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    /**
     * Getters for retrieving the values inside parameters
     */
    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public String getGenre() {
        return genre;
    }

//    public int getId() {
//        return id;
//    }

//    public String getFormat() {
//        return format;
//    }

//    public int getYear() {
//        return year;
//    }

//    public int getDepth() {
//        return depth;
//    }

//    public int getPagesVisited() {
//        return pagesVisited;
//    }

//    public long getTimeElapsed() {
//        return timeElapsed;
//    }
}
