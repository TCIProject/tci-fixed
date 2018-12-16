import model.Node;
import model.Tree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TreeTest {

    private Node root;
    private Tree tree;

    @Before
    public void setup() {
        // arrange
        root = new Node(null,"testLink");
        tree = new Tree(root);
    }

    /**
     * Test to create simple tree input and
     * output 1
     */
    @Test
    public void creatTreeNode() {
        // act
        Node head = tree.getRoot();
        // assert
        Assert.assertEquals(head,root);
    }

    /**
     * Test to add child in tree input and output 2
     */
    @Test
    public void addChildInTree() {
        // arrange
        Node child = new Node(root,"testLink1");
        // act
        tree.buildTree(child);
        // assert
        Assert.assertEquals(tree.DFS(),child);
    }

    /**
     * See if the node has been found thanks to the url
     * input and output
     */
    @Test
    public void testDFSforFoundNode() {
        // arrange
        Node foundnode = null;
        // act
        try {
            foundnode = tree.DFS(new URL("testLink"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // assert
        Assert.assertEquals(root,foundnode);
    }

}
