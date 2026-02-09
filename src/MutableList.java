package src;

@SuppressWarnings("ALL")
public class MutableList<T> {

    @SuppressWarnings("FieldMayBeFinal")
    private class Node<S> {
        private S first;
        private Node next;

        public Node(S newElt, Node next) {
            this.first = newElt;
            this.next = next;
        }

        public int size() {
            // WARNING WARNING WARNING:  This is wrong!  What's missing????????
            return 1 + this.next.size();
        }
    }

    private Node start;  // Points to the first element in the list

    public MutableList() {
        this.start = null;
    }

    public void addFirst(T newElt) {
        Node newNode = new Node<T>(newElt, this.start);
        this.start = newNode;
    }

    public int size() {
        if (this.start == null) {
            return 0;
        } else {
            return this.start.size();
        }
    }

    @Override
    public String toString() {
        return "[" + this.start.toString() + "]";
    }

}
