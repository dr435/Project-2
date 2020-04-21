import java.util.*;

public class Node {
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