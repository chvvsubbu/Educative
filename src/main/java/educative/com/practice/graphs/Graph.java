package main.java.educative.com.practice.graphs;

import main.java.educative.com.practice.linkedlist.DoublyLinkedList;
import main.java.educative.com.practice.linkedlist.Node;

public class Graph {

    int vertices;
    DoublyLinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new DoublyLinkedList[vertices];
        for (int i = 0; i < vertices ; i++) {
            adjacencyList[i] = new DoublyLinkedList<>();
        }
    }

    public void  addEdge(int source, int destination){
        this.adjacencyList[source].insertAtEnd(destination);
        // uncomment below line for undirected graph
        //this.adjacencyList[destination].insertAtEnd(source);
    }

    public void printGraph(){
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i <vertices ; i++) {
            if(adjacencyList[i] != null){

                System.out.print("|"+i+"| =>");
                Node dll = adjacencyList[i].getHeadNode();

                while (dll != null){
                    System.out.print("[" + dll.data + "] -> ");
                    dll = dll.nextNode;
                }
                System.out.println("null");
            }else {
                System.out.println("|" + i + "| => "+ "null");
            }

        }

    }
}
