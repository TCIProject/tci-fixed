package endpoint;

import model.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static java.lang.Integer.parseInt;

public class WebCrawler {
    private final Set<URL> links;
    private final long startTime;
    private long timeElapsed;
    private int depth;
    private int pagesVisited;
    private ArrayList<Node> books = new ArrayList<>();
    private ArrayList<Node> music = new ArrayList<>();
    private ArrayList<Node> movies = new ArrayList<>();
    private String baseUrl;

    public WebCrawler(final URL startURL) {
        this.baseUrl = startURL.toString();
        this.links = new HashSet<>();
        this.startTime = System.currentTimeMillis();
        depth = 0;
        pagesVisited = 0;
        crawl(initURLS(startURL));
        try {
            goThroughLinks();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void goThroughLinks() throws IOException {
        for (URL link :links) {
            pagesVisited++;
            Node node;
            if (link.toString().contains("?id=1") && !books.contains(link)) {
                node = populateNode(link);
                depth = 2;
                books.add(node);
            } else if (link.toString().contains("?id=2") && !movies.contains(link)) {
                node = populateNode(link);
                depth = 2;
                movies.add(node);
            } else if (link.toString().contains("?id=3") && !music.contains(link)) {
                node = populateNode(link);
                depth = 2;
                music.add(node);
            }
        }
    }

    public Node populateNode(URL url) throws IOException {
        Document doc = Jsoup.connect(url.toString()).get();
        Elements elements = doc.getElementsByClass("media-details");
        int id =  parseInt(url.toString().substring(url.toString().length() - 3));
        String title = elements.select("h1").first().text();
        ArrayList<Element> tableElements = elements.select("table").first().select("tr");
        Item item = new Item();
        Node node = new Node();
        item.setTitle(title);
        item.setId(id);
        item.setDepth(depth);

        for (Element tableElement: tableElements) {
            String tableHeader = tableElement.select("th").first().text();
            String tableData = tableElement.select("td").first().text();
            if (tableHeader.equals("Category")) {
                Category cat = Category.valueOf(tableData);
                item.setCategory(cat);
                switch (cat) {
                    case Books:
                        item = new Book(id, depth, pagesVisited, timeElapsed, title, cat);
                        break;
                    case Movies:
                        item = new Movie(id, depth, pagesVisited, timeElapsed, title, cat);
                        break;
                    case Music:
                        item = new Music(id, depth, pagesVisited, timeElapsed, title, cat);
                        break;
                }
                continue;
            } else if (tableHeader.equals("Genre")) {
                item.setGenre(tableData);
                continue;
            } else if ((tableHeader.equals("Format"))) {
                item.setFormat(tableData);
                continue;
            } else if ((tableHeader.equals("Year"))) {
                item.setYear(parseInt(tableData));
                continue;
            }
            if (item.getCategory().equals(Category.Books)) {
                if ((tableHeader.equals("Authors"))) {
                    ((Book) item).setAuthors(new ArrayList<>(Arrays.asList(tableData.split(", "))));
                } else if ((tableHeader.equals("Publisher"))) {
                    ((Book) item).setPublisher(tableData);
                } else if ((tableHeader.equals("ISBN"))) {
                    ((Book) item).setISBN(tableData);
                    node = new Node(url,item);
                }
            } else if (item.getCategory() == Category.Movies) {
                if ((tableHeader.equals("Director"))) {
                    ((Movie) item).setDirector(tableData);
                } else if ((tableHeader.equals("Writers"))) {
                    ((Movie) item).setWriters(new ArrayList<>(Arrays.asList(tableData.split(", "))));
                } else if ((tableHeader.equals("Stars"))) {
                    ((Movie) item).setStars(new ArrayList<>(Arrays.asList(tableData.split(", "))));
                    node = new Node(url,item);
                }
            } else {
                ((Music) item).setArtist(tableData);
                node = new Node(url,item);
            }
        }
        timeElapsed = System.currentTimeMillis() - startTime;
        item.setTimeElapsed(timeElapsed);
        item.setPagesVisited(pagesVisited);
        return node;
    }

    private void crawl(final Set<URL> urls){
        urls.removeAll((this.links));
        if (!urls.isEmpty()) {
            final Set<URL> newURLS = new HashSet<>();
            try {
                this.links.addAll(urls);
                for (final URL url : urls) {
                    System.out.println("Time = " + (System.currentTimeMillis() - this.startTime) + " connected to: " + url);
                    final Document document = Jsoup.connect(url.toString()).get();
                    final Elements linksOnPage = document.select("a[href]");
                    for (final Element element : linksOnPage) {
                        final String urlText = element.attr("abs:href").toLowerCase();
                        if (urlText.contains(baseUrl)) {
                            final URL discoveredURL = new URL(urlText);
                            newURLS.add(discoveredURL);
                        }
                    }
                }
            } catch (final Exception | Error ignored) { }
            crawl(newURLS);
        }
    }

    public String getBook(int id) {
        for (Node node: books) {
            if (node.getUrl().toString().contains("?id="+id))
                return ((Book)node.getItem()).getJSON();

        }
        return null;
    }

    public String getMovie(int id) {
        for (Node node: movies) {
            if (node.getUrl().toString().contains("?id="+id))
                return ((Movie)node.getItem()).getJSON();

        }
        return null;
    }

    public String getMusic(int id) {
        for (Node node: music) {
            if (node.getUrl().toString().contains("?id="+id))
                return ((Music)node.getItem()).getJSON();

        }
        return null;
    }

    public String getMovies() {
        StringBuilder json = new StringBuilder();
        for (Node node : movies) {
            json.append(((Movie) node.getItem()).getJSON()).append("\n");
        }
        return json.toString();
    }

    public String getMusic() {
        StringBuilder json = new StringBuilder();
        for (Node node : music) {
            json.append(((Music) node.getItem()).getJSON()).append("\n");
        }
        return json.toString();
    }

    public String getBooks() {
        StringBuilder json = new StringBuilder();
        for (Node node : books) {
            json.append(((Book) node.getItem()).getJSON()).append("\n");
        }
        return json.toString();
    }

    public String getBasedOnName(String name) {
        StringBuilder json = new StringBuilder();
        for (Node node: books) {
            if (node.getItem().getTitle().equals(name)) {
                json.append(((Book)node.getItem()).getJSON()).append("\n");
            }
        }
        for (Node node: music) {
            if (node.getItem().getTitle().equals(name)) {
                json.append(((Music)node.getItem()).getJSON()).append("\n");
            }
        }
        for (Node node: movies) {
            if (node.getItem().getTitle().equals(name)) {
                json.append(((Movie)node.getItem()).getJSON()).append("\n");
            }
        }
        return json.toString();
    }

    public String getBasedOnGenre(String genre) {
        String cap = genre.substring(0, 1).toUpperCase() + genre.substring(1);
        StringBuilder json = new StringBuilder();
        for (Node node: books) {
            if (node.getItem().getGenre().equals(cap)) {
                json.append(((Book)node.getItem()).getJSON()).append("\n");
            }
        }
        for (Node node: music) {
            if (node.getItem().getGenre().equals(cap)) {
                json.append(((Music)node.getItem()).getJSON()).append("\n");
            }
        }
        for (Node node: movies) {
            if (node.getItem().getGenre().equals(cap)) {
                json.append(((Movie)node.getItem()).getJSON()).append("\n");
            }
        }
        return json.toString();
    }

    private Set<URL> initURLS(final URL startURL){
        return Collections.singleton(startURL);
    }
}