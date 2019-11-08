package com.practice.educative.graphs;

import com.practice.educative.linkedlist.Node;
import com.practice.educative.stacksandququeues.Stack;

public class CheckMin {

    public static int findMin(Graph g, int source, int destination) {
       int vertices = g.vertices;
        Stack<Integer> stack = new Stack<>(vertices);
        boolean[] visitCheck = new boolean[vertices];
        visitCheck[source] = true;
        stack.push(source);

        int minLength = Integer.MAX_VALUE;

        while (! stack.isEmpty()){
            int value = stack.pop();
            Node temp = null;
            if(g.adjacencyList[value] != null){
                temp = g.adjacencyList[value].headNode;

                while (temp != null){
                    
                }
            }
        }

        return -1;
    }

}
