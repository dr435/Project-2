import java.util.*;

class GraphSearch {

    // Depth First Search using recursion
    ArrayList<Node> DFSRec(final Node start, final Node end) {
        // Create arraylist of visited nodes
        ArrayList<Node> visited = new ArrayList<Node>();
        visited.addAll(DFSRecHelper(start, end));

        if (visited.contains(end)) {
            return visited;
        }

        return null;
    }

    ArrayList<Node> DFSRecHelper(final Node start, final Node end) {
        ArrayList<Node> visList = new ArrayList<Node>();
        start.visFlag = true;
        visList.add(start);

        if (start == end) {
            return visList;
        }

        for (int i = 0; i < start.adjList.size(); i++) {
            if (!start.adjList[i].visFlag) {
                visList.addAll(DFSRecHelper(start.adjList[i], end));
                if (visited.contains(end)) {
                    return visited;
                }
            }
        }

        return visList;
    }

    // Depth First Search iterative
    ArrayList<Node> DFSIter(final Node start, final Node end) {
        // Initialize stack to store nodes for DFS and arraylist of visited nodes
        Stack<Node> s = new Stack<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();

        // Add start node to stack
        s.push(start);

        // While nodes have unexplored neighbors (stack not empty) explore them
        // Otherwise pop node off stack and look at previous neighbors
        while (!s.empty()) {
            Node cur = s.pop();
            visited.add(cur);

            // If the current node is the end node add to arraylist and return
            if (cur == end) {
                return visited;
            }

            // If node not end explore its neighbors
            for (int j = 0; j < cur.adjList.size(); j++) {
                if(!visited.contains(cur.adjList[j])) {
                    visited.add(cur.adjList[j]);
                    s.push(cur.adjList[j]);
                }
            }
        }

        // If the end node can't be found return null
        return null;
    }

    // Breadth First recursive
    ArrayList<Node> BFTRec(final Graph graph) {
        ArrayList<Node> traversal = new ArrayList<Node>();


    }

    ArrayList<Node> BFTRecHelper(Graph g, Queue<Node> q, ArrayList<Node list>)

    // Breadth First iterative
    ArrayList<Node> BFTIter(final Graph g) {
        // Initialize queue to store nodes and arraylist of visited nodes
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();
        Iterator<Node> nodes = graph.getAllNodes().iterator();

        while (nodes.hasNext()) {
            Node search = nodes.next();
            if (!visited.contains(search)) {
                q.add(search);
            }
            else {
                continue;
            }

            while (q.size() > 0) {
                Node cur = q.remove();
                visited.add(curr);

                // If cur is the end node, add it to visited and return
                if(cur.nodeVal.equals(end.nodeVal)) {
                    return visited;
                }

                // If not visited add children to queue
                for (int i = 0; i < cur.adjList.size(); i++) {
                    if (!visited.contains(cur.adjList[i])) {
                        q.add(cur.adjList[i]);
                    }
                }
            }
        }

        // If end not found return null
        return null;
    }
}