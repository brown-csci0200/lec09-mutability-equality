package src;

public abstract class AbsLinkList<T> implements IList<T> {

    // produces list with given newElt followed by elements of this
    public NodeList<T> addFirst(T newElt) {
        return new NodeList<T>(newElt, this);
    }
}
