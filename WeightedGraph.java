import java.util.*;

public class WeightedGraph {
     HashSet<WeightedNode> nodeSet;

     public WeightedGraph() {
         nodeSet = new HashSet<Node>();
     }

     void addNode(final String nodeVal) {
         // Create node
         WeightedNode newNode = new WeightedNode(nodeVal);
         nodeSet.add(newNode);
     }

     void addWeightedEdge(final WeightedNode first, final WeightedNode second, final int edgeWeight) {
         // Add elements to the adjacency list for each node respectively
         if(first.adjList.containsKey(second)) {
             return;
         }

         first.adjList.put(second, edgeWeight);
     }

     void removeDirectedEdge(final WeightedNode first, final WeightedNode second) {
         if(first.adjList.containsKey(second)) {
             first.adjList.remove(second);
         }
     }

     HashSet<Node> getAllNodes() {
         // Return the set of all nodes in the graph
         return nodeSet;
     }
 }