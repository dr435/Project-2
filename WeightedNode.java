import java.util.*;

public class WeightedNode {
    // Each node has it's value and an adjacency list
    String nodeVal;
    HashMap<WeightedNode, Integer> adjList;
    boolean visFlag;

    public WeightedNode(String nodeVal) {
        this.nodeVal = nodeVal;
        adjList = new HashMap<WeightedNode, Integer>();
        visFlag = false;
    }
}