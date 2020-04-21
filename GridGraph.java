import java.util.*;

public class GridGraph {
    HashSet<GridNode> nodeSet;

    public GridGraph() {
        nodeSet = new HashSet<GridNode>();
    }

    void addNode(final int x, final int y, final String nodeVal) {
        // Create node
        GridNode newNode = new GridNode(x, y, nodeVal);
        nodeSet.add(newNode);
    }

    void addUndirectedEdge(final GridNode first, final GridNode second) {
        if (first != second && !first.adjList.contains(second)) {
            if ((second.x >= first.x + 2 || second.x <= first.x - 2) || (second.y >= first.y + 2 || second.y <= first.y - 2)) {
                return;
            }
            else {
                first.adjList.add(second);
                second.adjList.add(first);
            }
        }

    }

    void removeUndirectedEdge(final GridNode first, final GridNode second) {
        if (first.adjList.contains(second) && second.adjList.contains(first)) {
            first.adjList.remove(second);
            second.adjList.remove(first);
        }

    }

    HashSet<GridNode> getAllNodes() {
        // Return the set of all nodes in the graph
        return nodeSet;
    }
}