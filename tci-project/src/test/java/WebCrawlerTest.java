import endpoint.WebCrawler;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class WebCrawlerTest {

    @Test(expected = MalformedURLException.class)
    public void testWebPageCraw() throws MalformedURLException {
        WebCrawler crawler = null;
        crawler = new WebCrawler(new URL("156"));
    }
}
