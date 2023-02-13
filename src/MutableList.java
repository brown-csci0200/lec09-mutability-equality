@SuppressWarnings("ALL")
public class MutableList<T> {
    private Node start;

    public MutableList() {
        this.start = null;
    }

    public void addFirst(int newElt) {
        Node newNode = new Node(newElt, this.start);
        this.start = newNode;
    }

    @Override
    public String toString() {
        return "[" + this.start.toString() + "]";
    }

    //    /**
//     * Checks if the two lists of integers are equal
//     *
//     * @param l1 - an Integer IList
//     * @param l2 - an Integer IList
//     * @return true if l1 and l2 have the same items in the same locations.
//     */
//    public boolean compareTwoLists(IList<Integer> l1, IList<Integer> l2) {
//        if (l1.size() != l2.size()) {
//            return false;
//        } else {
//            for (int i = 0; i < l1.size(); i++) {
//                if (!(l1.get(i).equals(l2.get(i)))) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

}
