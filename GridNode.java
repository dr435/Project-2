import java.util.*;

public class GridNode {
    // Each node has it's value and an adjacency list
    String nodeVal;
    int x;
    int y;
    HashMap<GridNode> adjList;
    boolean visFlag;

    public GridNode(int x, int y, String nodeVal) {
        this.nodeVal = nodeVal;
        this.x = x;
        this.y = y;
        adjList = new ArrayList<GridNode>();
        visFlag = false;
    }
}