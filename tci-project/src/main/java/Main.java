import endpoint.WebCrawler;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        WebCrawler crawler = new WebCrawler(new URL("http://i319728.hera.fhict.nl/"));
        System.out.println("Books");
        crawler.getBooks();
        System.out.println("Movies");
        crawler.getMovies();
        System.out.println("Music");
        crawler.getMusic();
    }
}
