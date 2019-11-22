package main.java.educative.com.practice.graphs;

import main.java.educative.com.practice.linkedlist.Node;
import main.java.educative.com.practice.stacksandququeues.Stack;

public class CheckPaths {
    public static boolean checkPath(Graph g, int source, int destination) {

        int num_of_vertices = g.vertices;
        boolean[] visited = new boolean[num_of_vertices];
        Stack<Integer> stack = new Stack<Integer>(num_of_vertices);
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()){
            int value = stack.pop();
            Node temp = null;
            if(g.adjacencyList[value] != null)
                    temp = g.adjacencyList[value].headNode;
            while (temp != null){
                if(!visited[(Integer) temp.data]){
                    if((Integer) temp.data == destination)
                        return true;
                }
                stack.push((Integer) temp.data);
                visited[(Integer) temp.data] = true;
                temp = temp.nextNode;
            }
        }
        return  false;
    }
}
