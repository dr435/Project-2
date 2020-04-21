import java.util.*;

public class Main {

    Graph createRandomUnweightedGraph(int n) {
        Graph g = new Graph();

        for (int i = 0; i < n; i++) {
            g.addNode(String.valueOf(i));
        }

        HsahSet<Node> nodes = g.getAllNodes();
        Random rand = new Random();

        for (Node node1 : nodes) {
            for (Node node2 : nodes) {
                if (node1 != node2 && rand.nextInt(1) == 1) {
                    g.addUndirectedEdge(node1, node2);
                    g.addUndirectedEdge(node2, node1);
                }
            }
        }

        return g;
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

        return g;
    }

    ArrayList<Node> BFTIterLinkedList(final Graph graph) {
        GraphSearch gs = new GraphSearch();

        return gs.BFTIter(graph);
    }

    ArrayList<Node> BFTRecLinkedList(final Graph graph) {
        GraphSearch gs = new GraphSearch();

        return gs.BFTRec(graph);
    }

    DirectedGraph createRandomDAGIter(final int n) {
        DirectedGraph dg = new Graph();

        for (int i = 0; i < n; i++) {
            dg.addNode(String.valueOf(i));
        }

        HsahSet<Node> nodes = dg.getAllNodes();
        Random rand = new Random();

        for (Node node1 : nodes) {
            for (Node node2 : nodes) {
                if (node1 != node2 && rand.nextInt(1) == 1) {
                    dg.addDirectedEdge(node1, node2);
                }
            }
        }

        return g;
    }

    WeightedGraph createRandomCompleteWeightedGraph(final int n) {
        WeightedGraph wg = new WeightedGraph();

        for (int i = 0; i < n; i++) {
            wg.addNode(String.valueOf(n));
        }

        HashSet<WeightedNode> nodes = wg.getAllNodes();
        Random rand = new Random();

        for (WeightedNode node1 : nodes) {
            for (WeightedNode node2 : nodes) {
                if (node1 != node2 && !node1.adjList.containsKey(node2)) {
                    Integer weight = rand.nextInt(n * n);
                    wg.addWeightedEdge(node1, node2, weight);
                }
            }
        }
    }

    WeightedGraph createLinkedList(final int n) {
        WeightedGraph wg = new WeightedGraph();

        for (int i = 0; i < n; i++) {
            wg.addNode(String.valueOf(i));
        }

        HashSet<WeightedNode> nodes = wg.getAllNodes();
        WeightedNode[] nodesArr = nodes.toArray();

        for(int i = 1; i < nodesArr.length; i++) {
            wg.addWeightedEdge(nodesArr[i], nodesArr[i--], 1);
        }

        return wg;
    }

    HashMap<WeightedNode, Integer> dijkstras(final WeightedNode start) {
        HashMap<WeightedNode, Integer> distances = new HashMap<WeightedNode, Integer>();

        WeightedNode curr = start;

        while (curr != null) {
            distances.put(curr, 0);
        }
    }

    GridGraph createRandomGridGraph(final int n) {
        GridGraph gg = new GridGraph();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                gg.addNode(i, j, String.valueOf(i + j));
            }
        }

        HashSet<GridNode> nodes = gg.getAllNodes();

        for (GridNode node1 : nodes) {
            for (GridNode node2 : nodes) {
                if (rand.nextInt(1) == 1 && node1 != node2) {
                    gg.addUndirectedEdge(node1, node2);
                }
            }
        }
    }
}