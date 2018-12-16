import model.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing class for Node functionality
 */
public class NodeTest {

    private Node node;
    private Node parent;
    private String URL;
    private String JSON;

    /**
     * Create the dummy node for test before all the tests together with some parameters
     */
    @Before
    public void setup() {
        // arrange
        parent = null;
        URL = "testLink";
        JSON = "someJSON";
        node = new Node(parent, JSON, URL);
    }

    /**
     * Test the retrieving of the URL for a node by using for constructing the object the first constructor defined
     * in the Node Class
     */
    @Test
    public void getNodeURL() {
        // act
        String URLTest = node.getURLLink();
        // assert
        Assert.assertEquals(URL,URLTest);
    }

    /**
     * Test the retrieving of the parent node for a node
     */
    @Test
    public void getNodeParent() {
        // act
        Node parent = node.getParent();
        // assert
        Assert.assertNull(parent);
    }

    /**
     * Test if the setVisited for a node is working
     */
    @Test
    public void setVisitedTest() {
        // act
        node.setVisited(true);
        // assert
        Assert.assertTrue(node.isVisited());
    }
    /**
     * Test if the setJSONString for a node is working
     */
    @Test
    public void setJSONStringTest() {
        // act
        node.setJSONString(JSON);
        // assert
        Assert.assertEquals(JSON, node.getJSONString());
    }
}
