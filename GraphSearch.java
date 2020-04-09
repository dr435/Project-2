class GraphSearch {

    // Depth First Search using recursion
    ArrayList<Node> DFSRec(final Node start, final Node end) {
        // Create arraylist of visited nodes
        ArrayList<Node> visited = new ArrayList<Node>();
        if (!start.visFlag) {
            visited.add(start);
            start.visFlag = true;
        }

        // If start node is end node return
        if (start.nodeVal.equals(end.nodeVal)) {
            return visited;
        }

        // Otherwise go thru adjacent nodes depth first
        for (int i = 0; i < start.adjList.size(); i++) {
            // Check if node not visited
            if (!start.adjList[i].visFlag) {
                visited.addAll(DFSRec(start.adjList[i], end));
                if (visited.contains(end)) {
                    return visited;
                }
            }
        }
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
            if (cur.nodeVal.equals(end.nodeVal)) {
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

    }

    // Breadth First iterative
    ArrayList<Node> BFTIter(Graph g) {
        // Initialize queue to store nodes and arraylist of visited nodes
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();

        // Add start to the queue
        q.add(start);

        while (q.size() > 0) {
            Node cur = q.pop();
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

        // If end not found return null
        return null;
    }
}
