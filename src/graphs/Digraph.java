package graphs;

import java.util.*;

public class Digraph<V, E> implements IGraph<V, E>
{
    //adjacency lists
    private Map<V, LinkedList<Edge<V>>> lists;
    private int edgeSize;

    public Digraph()
    {
        lists = new HashMap<>();
    }

    @Override
    public boolean addVertex(V vertex)
    {
        //is the vertex already in the graph?
        if (containsVertex(vertex))
        {
            return false; //duplicate vertex!
        }

        lists.put(vertex, new LinkedList<>());
        return true;
    }

    @Override
    public boolean addEdge(V first, V second, int weight)
    {
        if (first.equals(second) ||
            !containsVertex(first) || !containsVertex(second) ||
            containsEdge(first, second))
        {
            return false; //duplicate edge or one of the vertices is missing!
        }

        //add edge to both adjacency lists
        Edge<V> edge = new Edge<>(first, second, weight);
        lists.get(first).add(edge);
        edgeSize++;

        return true;
    }

    @Override
    public boolean removeVertex(V vertex)
    {
        //TODO Write removeVertex()
        return false;
    }

    @Override
    public boolean removeEdge(V first, V second)
    {
        //TODO Write removeEdge()
        return false;
    }

    @Override
    public boolean containsVertex(V vertex)
    {
        return lists.containsKey(vertex);
    }

    @Override
    public boolean containsEdge(V first, V second)
    {
        //make sure the vertices exist
        if (!containsVertex(first) || !containsVertex(second))
        {
            return false;
        }

        //look up the edge in one of the adjacency lists
        LinkedList<Edge<V>> adjacents = lists.get(first);
        Edge<V> lookUp = new Edge<>(first, second, 0);

        return adjacents.contains(lookUp);
    }

    @Override
    public Set<V> getVertexSet()
    {
        return new HashSet<>(lists.keySet());
    }

    @Override
    public Set<Edge<V>> getEdgeSet()
    {
        Set<Edge<V>> results = new HashSet<>();
        for (V source : lists.keySet()) {
            results.addAll(lists.get(source));
        }
        return results;
    }

    @Override
    public int vertexSize()
    {
        return lists.size();
    }

    @Override
    public int edgeSize()
    {
        return edgeSize;
    }

    @Override
    public List<V> dfs(V source)
    {
        return null;
    }

    @Override
    public List<V> bfs(V source)
    {
        return null;
    }
}
