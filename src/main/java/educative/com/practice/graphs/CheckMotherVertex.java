package main.java.educative.com.practice.graphs;

import main.java.educative.com.practice.linkedlist.Node;

public class CheckMotherVertex {

    public static int findMotherVertex(Graph g){

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
        return edgesCount;
    }


}
