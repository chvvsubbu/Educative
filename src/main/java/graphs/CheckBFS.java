package com.practice.educative.graphs;

import com.practice.educative.linkedlist.DoublyLinkedList;
import com.practice.educative.linkedlist.Node;
import com.practice.educative.stacksandququeues.Queue;

import java.util.HashMap;

public class CheckBFS {

    public static String bfsTraversal(Graph g, int source) {
        String result = "";
        int num_of_vertices = g.vertices;

        Queue<Integer> integerQueue = new Queue<>(num_of_vertices);
        HashMap<Integer, Integer > hashMap = new HashMap<Integer, Integer>();
        Node dll = null;
        integerQueue.enqueue(source);
        while (!integerQueue.isEmpty()){
            int value = integerQueue.dequque();
            if(!hashMap.containsKey(value))
                result = result.concat(value+"");
            hashMap.put(value,1);
            dll = g.adjacencyList[value].getHeadNode();
            while (dll != null){
                integerQueue.enqueue((Integer) dll.data);
                dll=dll.nextNode;
            }
        }
        System.out.println(result);
        return result; //For the above graph, it should return "01234" or "02143"
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println(bfsTraversal(graph, 0));
    }
}


