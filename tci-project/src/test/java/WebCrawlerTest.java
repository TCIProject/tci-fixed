import endpoint.WebCrawler;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class WebCrawlerTest {

    private static final String BASE_URL = "http://i319728.hera.fhict.nl/";
    private WebCrawler crawler;

    public WebCrawlerTest() throws MalformedURLException {
        crawler = new WebCrawler(new URL(BASE_URL));
    }

    @Test(expected = MalformedURLException.class)
    public void testWebPageCraw() throws MalformedURLException {
        crawler = new WebCrawler(new URL("156"));
    }

    @Test
    public void testWebCrawlerReturnBookWithId() {
        Assert.assertNull(crawler.getBook(504));
    }

    @Test
    public void testWebCrawlerReturnMovieWithId() {
        Assert.assertNull(crawler.getMovie(101));
    }

    @Test
    public void testWebCrawlerReturnMusicWithId() {
        Assert.assertNull(crawler.getMusic(101));
    }

    @Test
    public void testWebCrawlerReturnMusicWithGenre() {
        Assert.assertEquals(crawler.getMusic(304)+'\n',crawler.getBasedOnGenre("jaz"));
    }

    @Test
    public void testWebCrawlerReturnMovieWithGenre() {
        Assert.assertEquals(crawler.getMovie(202)+'\n' + crawler.getMovie(204) + '\n',crawler.getBasedOnGenre("comedy"));
    }

    @Test
    public void testWebCrawlerReturnBookWithGenre() {
        Assert.assertEquals(crawler.getBook(104)+'\n' + crawler.getBook(103)+'\n' + crawler.getBook(102) + '\n' + crawler.getBook(101)+'\n',crawler.getBasedOnGenre("tech"));
    }

    @Test
    public void testWebCrawlerReturnName() {
        Assert.assertEquals(crawler.getBasedOnName("Beethoven: Complete Symphonies"),crawler.getMusic(301)+'\n');
    }
}
