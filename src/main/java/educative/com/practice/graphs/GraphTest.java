package main.java.graphs;

import main.java.graphs.Graph;

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

           graph.printGraph();
        }

}
