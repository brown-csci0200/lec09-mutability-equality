@SuppressWarnings("FieldMayBeFinal")
public class Node {
    private int first;
    private Node next;

    public Node(int newElt, Node next) {
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
