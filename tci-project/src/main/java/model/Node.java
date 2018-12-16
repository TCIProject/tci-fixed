package model;

import java.util.ArrayList;

/**
 * This class is going to contain the links of the website
 * where the web crawler will go through and save them as nodes
 */
public class Node {
    private boolean isVisited;
    private Node parent;
    private ArrayList<Node> nodes;
    private String JSONString;
    private String URLLink;

    public Node(Node parent, String URLLink) {
        this.parent = parent;
        this.URLLink = URLLink;
    }

    public Node(Node parent, String JSONString, String URLLink) {
        this.isVisited = false;
        this.parent = parent;
        this.JSONString = JSONString;
        this.URLLink = URLLink;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     * @param JSONString The json parameter string will get the input of book,music or movie
     *                   and save it as a json in the node class
     */
    public void setJSONString(String JSONString) {
        this.JSONString = JSONString;
    }

    public void setURLLink(String URLLink) {
        this.URLLink = URLLink;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public Node getParent() {
        return parent;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public String getJSONString() {
        return JSONString;
    }

    public String getURLLink() {
        return URLLink;
    }
}
