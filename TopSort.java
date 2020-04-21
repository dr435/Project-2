import java.util.*;

public class TopSort {

    ArrayList<Node> Kahns(final DirectedGraph graph) {
        HashMap<Node, Integer> inDegree = graph.inDegree;
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Node> sorted = new ArrayList<Node>();

        for (Node curr : inDegree.keySet) {
            if (inDegree.get(curr) == 0) {
                q.add(curr);
            }
        }

        while(q.size() > 0) {
            Node curr = q.peek();
            q.remove(curr);

            sorted.add(curr);

            for (int i = 0; i < curr.adjList.size(); i++) {
                Integer count =  inDegree.get(curr.adjList[i]);
                Integer count = count - 1;
                inDegree.put(curr.adjList[i], count);
                if (count == 0) {
                    queue.add(curr.adjList[i]);
                }
            }
        }

        return sorted;
    }

    ArrayList<Node> mDFS(final DirectedGraph graph) {
        HashSet<Node> nodes = graph.getAllNodes();
        //Stack<Node> s = new Stack<Node>();
        ArrayList<Node> sorted = new ArrayList<Node>();

        for (Node curr : nodes) {
            if (!curr.visFlag) {
                sorted = mDFSHelper(curr, sorted);
            }
            sorted.add(curr);
        }

        return sorted;
    }

    ArrayList<Node> mDFSHelper(Node node, ArrayList<Node> list) {
        node.visFlag = true;

        for (Node curr : node.adjList) {
            if (!curr.visFlag) {
                sorted = mDFSHelper(curr, list);
            }
            list.add(curr);
        }

        return list;
    }
}