import java.util.*;

public class Graph {
    HashSet<Node> nodeSet;

    public Graph() {
        nodeSet = new HashSet<Node>();
    }

    void addNode(final String nodeVal) {
        // Create node
        Node newNode = new Node(nodeVal);
        nodeSet.add(newNode);
    }

    void addUndirectedEdge(final Node first, final Node second) {
        // Add elements to the adjacency list for each node respectively
        if(first.adjList.contains(second) && second.adjList.contains(first)) {
            return;
        }

        first.adjList.add(second);
        second.adjList.add(first);
    }

    void removeUndirectedEdge(final Node first, final Node second) {
        if(first.adjList.contains(second) && second.adjList.contains(first)) {
            first.adjList.remove(second);
            second.adjList.remove(first);
        }
    }
    HashSet<Node> getAllNodes() {
        // Return the set of all nodes in the graph
        return nodeSet;
    }
}