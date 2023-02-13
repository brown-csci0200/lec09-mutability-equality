public class Link<T> extends AbsLinkList<T> implements IList<T> {
    T first;
    IList<T> rest;

    public Link(T f, IList<T> r) {
        super();
        this.first = f;
        this.rest = r;
    }

    // returns number of elements in a list
    public int size() {
        return 1 + this.rest.size();
    }

    @Override
    public String toString() { return "[" + this.toStringHelper() + "]"; }
    public String toStringHelper() { return this.first.toString() + ", " + this.rest.toStringHelper(); }

}
