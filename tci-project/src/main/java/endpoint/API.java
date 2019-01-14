package endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.MalformedURLException;
import java.net.URL;

@Path("api")
public class API {
    private static final String BASE_URL = "http://i319728.hera.fhict.nl/";
    private WebCrawler webCrawler;

    {
        try {
            webCrawler = new WebCrawler(new URL(BASE_URL));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Welcome";
    }

    @GET
    @Path("music/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMusic(@PathParam("id") int id) {
        String music = webCrawler.getMusic(id);
        return music;
    }

    @GET
    @Path("movie/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovie(@PathParam("id") int id) {
        String movie = webCrawler.getMovie(id);
        return movie;
    }

    @GET
    @Path("book/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook(@PathParam("id") int id) {
        String book = webCrawler.getBook(id);
        return book;
    }

}
