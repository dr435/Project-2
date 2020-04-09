import java.util.*;

public class Graph {
    // TODO: When node is created, store it in a set of all nodes in the graph
    HashSet<Node> nodeSet;

    public Graph() {
        nodeSet = new HashSet<Node>;
    }

    void addNode(final String nodeVal) {
        // Create node
        Node newNode = new Node(nodeVal);
        nodeSet.add(newNode);
    }

    void addUndirectedEdge(final Node first, final Node second) {
        // Add elements to the adjacency list for each node respectively
        first.adjList.add(second);
        second.adjList.add(first);
    }

    void removeUndirectedEdge(final Node first, final Node second) {
        first.adjList.remove(second);
        second.adjList.remove(first);
    }
    HashSet<Node> getAllNodes() {
        // Return the set of all nodes in the graph
        return nodeSet;
    }
}

class Node {
    // Each node has it's value and an adjacency list
    String nodeVal;
    ArrayList<Node> adjList;
    boolean visFlag;

    public Node(String nodeVal) {
        this.nodeVal = nodeVal;
        adjList = new ArrayList<Node>();
        visFlag = false;
    }
}