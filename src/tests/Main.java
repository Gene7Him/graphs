package tests;

import graphs.Digraph;
import graphs.Edge;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Digraph<String, Integer> socialNetwork = new Digraph<>();

        // Adding vertices (people)
        socialNetwork.addVertex("Alice");
        socialNetwork.addVertex("Bob");
        socialNetwork.addVertex("Charlie");
        socialNetwork.addVertex("Diana");
        socialNetwork.addVertex("Eve");
        socialNetwork.addVertex("Frank");
        socialNetwork.addVertex("Grace");
        socialNetwork.addVertex("Hank");
        socialNetwork.addVertex("Ivy");
        socialNetwork.addVertex("Dwayne");

        // Array of edges (undirected graph, so we'll add both directions)
        Edge<String>[] edges = new Edge[] {
            new Edge<>("Alice", "Bob", 5),
            new Edge<>("Alice", "Charlie", 3),
            new Edge<>("Alice", "Diana", 6),
            new Edge<>("Bob", "Diana", 4),
            new Edge<>("Bob", "Eve", 7),
            new Edge<>("Charlie", "Eve", 2),
            new Edge<>("Charlie", "Frank", 3),
            new Edge<>("Diana", "Frank", 8),
            new Edge<>("Eve", "Grace", 6),
            new Edge<>("Eve", "Hank", 4),
            new Edge<>("Frank", "Grace", 5),
            new Edge<>("Grace", "Ivy", 3),
            new Edge<>("Hank", "Ivy", 7),
            new Edge<>("Alice", "Hank", 8),
            new Edge<>("Diana", "Ivy", 5),
            new Edge<>("Ivy", "Dwayne", 3)
        };

        // Loop over the array and add edges in both directions
        for (Edge<String> edge : edges) {
            // Add the edge in both directions (for undirected behavior)
            socialNetwork.addEdge(edge.getSource(), edge.getDest(), edge.getWeight());
            socialNetwork.addEdge(edge.getDest(), edge.getSource(), edge.getWeight());
        }
    }
}