package interfaceModel;

import java.util.ArrayList;

public interface Node {
    void setVisited(boolean visited);

    void setParent(Node parent);

    void setNodes(ArrayList<Node> nodes);

    void setJSONString(String JSONString);

    void setURLLink(String URLLink);

    boolean isVisited();

    Node getParent();

    ArrayList<Node> getNodes();

    String getJSONString();

    String getURLLink();
}
