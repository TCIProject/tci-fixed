package model;

/**
 * This class is going to contain the links of the website
 * where the web crawler will go through and save them as nodes
 * together with general item
 */

import java.net.URL;

public class Node {
    private URL url;
    private Item item;

    /**
     * Constructor for the Node Model
     * @param url
     * @param item
     */
    public Node(URL url, Item item) {
        this.url = url;
        this.item = item;
    }

    public Node() {
    }

    /**
     * Setters for the parameters
     */
//    public void setUrl(URL url) {
//        this.url = url;
//    }

//    public void setItem(Item item) {
//        this.item = item;
//    }

    /**
     * Getters for retrieving the values inside the parameters
     * @return
     */
    public URL getUrl() {
        return url;
    }

    public Item getItem() {
        return item;
    }
}