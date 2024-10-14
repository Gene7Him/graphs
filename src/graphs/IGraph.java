package graphs;

import java.util.List;
import java.util.Set;

public interface IGraph<V, E>
{
    //put vertices and edges in the graph
    boolean addVertex(V vertex);
    boolean addEdge(V first, V second, int weight);

    //removing things
    boolean removeVertex(V vertex);
    boolean removeEdge(V first, V second);

    //finding things
    boolean containsVertex(V vertex);
    boolean containsEdge(V first, V second);

    //accessing elements
    Set<V> getVertexSet();
    Set<Edge<V>> getEdgeSet();

    //counting things
    int vertexSize();
    int edgeSize();

    //traversals
    List<V> dfs(V source);
    List<V> bfs(V source);
}