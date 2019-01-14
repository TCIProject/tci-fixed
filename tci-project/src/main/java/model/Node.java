package model;

import java.util.ArrayList;
import model.Item;

/**
 * This class is going to contain the links of the website
 * where the web crawler will go through and save them as nodes
 */


import java.net.URL;

public class Node {
    private URL url;
    private Item item;

    public Node(URL url, Item item) {
        this.url = url;
        this.item = item;
    }

    public Node() {
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}