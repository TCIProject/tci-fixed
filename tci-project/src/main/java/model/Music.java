package model;

public class Music extends Item {
    private String artist;

    public Music(String genre, String format, int date, String artist) {
        super(genre, format, date);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
