package graphs;


public class Edge<V>
{
    private V source;
    private V dest;
    private int weight;

    public Edge(V source, V dest, int weight)
    {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public V getSource()
    {
        return source;
    }

    public V getDest()
    {
        return dest;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public boolean equals(Object other)
    {
        //double check that this is a new object, not null, and an Edge object
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        //cast the param to an Edge
        Edge<?> otherEdge = (Edge<?>) other;

        //compare based on our fields
        return (source.equals(otherEdge.source) && dest.equals(otherEdge.dest)) ||
                (dest.equals(otherEdge.source) && source.equals(otherEdge.dest));
    }

    @Override
    public int hashCode()
    {
        return source.hashCode() * dest.hashCode();
    }

    @Override
    public String toString()
    {
        return "(" + source + ", " + dest + ")";
    }
}
