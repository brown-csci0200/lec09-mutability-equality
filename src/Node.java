package src;

@SuppressWarnings("FieldMayBeFinal")
public class Node<T> {
    private T first;
    private Node<T> next;

    public Node(T newElt, Node next) {
        this.first = newElt;
        this.next = next;
    }

    @Override
    public String toString() {
        if (this.next == null)
            return this.first.toString();
        else
            return this.first.toString() +
                    ", " + this.next.toString();
    }
}
