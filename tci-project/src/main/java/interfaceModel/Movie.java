package interfaceModel;

import com.google.gson.Gson;

import java.util.ArrayList;

public interface Movie {
    String getJSON();

    String getDirector();

    void setDirector(String director);

    ArrayList<String> getWriters();

    void setWriters(ArrayList<String> writers);

    ArrayList<String> getStars();

    void setStars(ArrayList<String> stars);
}
