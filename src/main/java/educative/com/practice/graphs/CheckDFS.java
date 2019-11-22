package main.java.graphs;

import main.java.linkedlist.Node;
import main.java.stacksandququeues.Queue;
import main.java.stacksandququeues.Stack;

public class CheckDFS {

    public static String dfsTraversal(Graph g, int source) {
        String result = "";
        int num_of_vertices = g.vertices;
        boolean[] visited = new boolean[num_of_vertices];
        Stack<Integer> stack = new Stack<Integer>(num_of_vertices);
        stack.push(source);
        visited[source] = true;
        while (!stack.isEmpty()) {
            int current_node = stack.pop();
            result += String.valueOf(current_node);
            Node temp = null;
            if(g.adjacencyList[current_node] !=null)
                temp = g.adjacencyList[current_node].headNode;
            while (temp != null) {
                if (!visited[(Integer) temp.data]) {
                    stack.push((Integer) temp.data);
                    //Visit the node
                    visited[current_node] = true;
                }
                temp = temp.nextNode;

            }
        }
        return result;

    }



}
