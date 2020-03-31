import java.util.*;

public class Graph {

    // List of adjacent/connected nodes
    HashMap<Node, ArrayList<String>> adjList = new HashMap<Node, ArrayList<String>>(); 

    void addNode(final String nodeVal) {

    }

    void addUndirectedEdge(final Node first, final Node second) {

    }

    void removeUndirectedEdge(final Node first, final Node second) {

    }
    HashSet<Node> getAllNodes() {

    }
}

class Node {
    String nodeVal;

    public Node(String nodeVal) {
        this.nodeVal = nodeVal;
    }
}