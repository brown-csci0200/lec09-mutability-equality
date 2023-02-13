public class EmptyList<T> extends AbsLinkList<T> implements IList<T> {

    // returns number of elements in a list
    public int size() { return 0; }  // run-time is O(1)

    @Override
    public String toString() { return "[]"; }
    public String toStringHelper() { return "end-of-list"; }
}
