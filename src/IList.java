package src;

public interface IList<T> {
    // returns number of elements in a list
    public int size();
    // produces list with given newElt followed by elements of this
    public NodeList addFirst(T newElt);
    // helper function for printing lists
    public String toStringHelper ();
}
