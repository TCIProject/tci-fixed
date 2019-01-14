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
        if (music != null)
            return music;
        else return "EmptyPage";
    }

    @GET
    @Path("movie/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovie(@PathParam("id") int id) {
        String movie = webCrawler.getMovie(id);
        if (movie != null)
            return movie;
        else return "EmptyPage";
    }

    @GET
    @Path("book/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook(@PathParam("id") int id) {
        String book = webCrawler.getBook(id);
        if (book != null)
            return book;
        else return "EmptyPage";
    }

    @GET
    @Path("book")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBooks() {
        String json =  webCrawler.getBooks();
        if (json != null)
            return json;
        else return "EmptyPage";
    }

    @GET
    @Path("music")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMusic() throws Exception {
        String json = webCrawler.getMusic();
        if (json != null)
            return json;
        else return "EmptyPage";
    }

    @GET
    @Path("movie")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovie() {
        String json = webCrawler.getMovies();
        if (json != null)
            return json;
        else return "EmptyPage";
    }

    @GET
    @Path("title/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getItemOnName(@PathParam("name") String name) {
        String json = webCrawler.getBasedOnName(name);
        if (json != null)
            return json;
        else return "EmptyPage";
    }

    @GET
    @Path("genre/{genre}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getItemOnGenre(@PathParam("genre") String genre) {
        String json = webCrawler.getBasedOnGenre(genre);
        if (json != null)
            return json;
        else return "EmptyPage";
    }
}
