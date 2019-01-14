package interfaceModel;

import java.util.ArrayList;

/**
 * Interface for testing purposes
 */
public interface Book {

    String getJSON();

    ArrayList<String> getAuthors();

    void setAuthors(ArrayList<String> authors);

    String getPublisher();

    void setPublisher(String publisher);

    String getISBN();

    void setISBN(String ISBN);

}
