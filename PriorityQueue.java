public interface PriorityQueue{
    void add(Ticket x);
    boolean isEmpty();
    Ticket removeMin();
    Ticket peekMin();
}
