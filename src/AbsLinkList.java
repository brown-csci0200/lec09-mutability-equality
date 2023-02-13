public abstract class AbsLinkList<T> implements IList<T> {

    // produces list with given newElt followed by elements of this
    public Link<T> addFirst(T newElt) {
        return new Link<T>(newElt, this);
    }
}
