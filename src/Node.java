package src;

@SuppressWarnings("FieldMayBeFinal")
public class Node<S> {
    private S first;
    private Node next;

    public Node(S newElt, Node next) {
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
