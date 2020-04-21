import java.util.*;

public class DirectedGraph {
    HashSet<Node> nodeSet;
    HashMap<Node, Integer> inDegree;

    public DirectedGraph() {
        nodeSet = new HashSet<Node>();
        inDegree = new HashMap<Node, Integer>();
    }

    void addNode(final String nodeVal) {
        // Create node
        Node newNode = new Node(nodeVal);
        nodeSet.add(newNode);

        inDegree.put(newNode, 0);
    }

    void addDirectedEdge(final Node first, final Node second) {
        // Add elements to the adjacency list for each node respectively
        if(first.adjList.contains(second)) {
            return;
        }

        Integer count = inDegree.get(second);
        first.adjList.add(second);
        inDegree.put(second, count + 1);


    }

    void removeDirectedEdge(final Node first, final Node second) {
        if(first.adjList.contains(second)) {
            first.adjList.remove(second);

            Integer count = inDegree.get(second);
            inDegree.put(second, count - 1);
        }
    }
    HashSet<Node> getAllNodes() {
        // Return the set of all nodes in the graph
        return nodeSet;
    }
}