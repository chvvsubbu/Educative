package com.practice.educative.graphs;

import com.practice.educative.linkedlist.Node;

public class CheckNumEdges {

    public static int numEdges(Graph g) {
        int totalVertices = g.vertices;
        Node iterator = null;
        int edgesCount =0;

        for (int i = 0; i <g.vertices ; i++) {
            if(g.adjacencyList[i] != null){
                iterator = g.adjacencyList[i].headNode;
                while (iterator != null){
                    edgesCount++;
                    iterator =iterator.nextNode;
                }
            }
        }
        return edgesCount/2;
    }


}
