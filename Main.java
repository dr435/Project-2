import java.util.*;

public class Main {

    Graph createRandomUnweightedGraph(int n) {

    }

    Graph createLinkedList(int n) {
        Graph g = new Graph();

        for (int i = 0; i < n; i++) {
            g.addNode(String.valueOf(i));
        }

        HashSet<Node> nodes = g.getAllNodes();
        Node[] nodesArr = nodes.toArray();

        for(int i = 1; i < nodesArr.length; i++) {
            g.addUndirectedEdge(nodesArr[i], nodesArr[i--]);
        }
    }
}