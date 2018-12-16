package model;

import java.net.URL;
import java.util.ArrayList;

/**
 * This is class is going to store the nodes
 * and different actions can performed
 */
public class Tree {

    private Node root;
    private ArrayList<Node> nodes;

    public Tree(Node root) {
        this.nodes = new ArrayList<>();
        this.root = root;
    }

    /**
     * @param node The tree will be constructed by passing a
     *             Node to the method
     *
     */
    public void buildTree(Node node) {

    }

    public Node DFS() {
        return null;
    }

    /**
     * @param findNode the parameter gets a link to search for
     * @return and it's node
     */
    public Node DFS(URL findNode) {
        return null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
