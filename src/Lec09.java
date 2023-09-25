package src;

@SuppressWarnings("ReassignedVariable")
public class Lec09 {

    public static void main(String[] args) {
        // Here are the examples we talked about in class
        // See each method below for the code, uncomment to run
//        genericTypesExample();
//        thisExample();
//        courseExampleImmutableList();
//        courseExampleMutableList();
//        courseExampleImmutableListExtra(); // bonus version

        // Example we didn't see yet
        // equalityExample();
    }

    public static void thisExample() {
        Course visa = new Course("visa120", 18);
        Course cs200 = new Course("cs200", 80);

    }

    /**
     * Immutable list example from class
     */
    public static void courseExampleImmutableList() {
        Course visa = new Course("visa120", 18);

        IList<Course> C1 = new EmptyList<Course>(); // NOTE -- IMMUTABLE LIST
        C1 = C1.addFirst(new Course("csci200", 470));
        C1 = C1.addFirst(visa);
        visa.enroll();

        // what do we expect to see here?
        System.out.println(C1);
    }

    /**
     * Same as above, but for a mutable list
     */
    public static void courseExampleMutableList() {
        Course visa = new Course("visa120", 18);
        MutableList<Course> mList = new MutableList<Course>();
        mList.addFirst(new Course("csci200", 470));
        mList.addFirst(visa);

        visa.enroll();

        // what do we expect to see here?
        System.out.println(mList);
    }

    /*
     * Bonus version:  immutable example with a twist
     * to demonstrate why we care about immutable data structures
     */
    public static void courseExampleImmutableListExtra() {
        Course visa = new Course("visa120", 18);

        IList<Course> C1 = new EmptyList<Course>(); // NOTE -- IMMUTABLE LIST
        C1 = C1.addFirst(new Course("csci200", 470));
        IList<Course> C2 = C1;

        C1 = C1.addFirst(visa);
        visa.enroll();

        // what do we expect to see here?
        System.out.println(C1);
        System.out.println(C2);
        // C2 list is unchanged* even though we modified C1!!
        // Compare this to the immutable version
        // *: We CAN still objects in the list (like visa), just not the list structure
        // (order/number of elements, etc.)
    }

    public static void equalityExample() {
        MutableList<Integer> L1 = new MutableList<Integer>();
        L1.addFirst(6);
        L1.addFirst(8);
        System.out.println("L1 is " + L1);

        MutableList<Integer> L2 = new MutableList<Integer>();
        L2.addFirst(6);
        L2.addFirst(8);
        System.out.println("L2 is " + L2);

        System.out.println(L1 == L2);
        System.out.println(L1.equals(L2));
        System.out.println(L1.toString() == L2.toString());
        System.out.println(L1.toString().equals(L2.toString()));
    }

    public static void genericTypesExample() {
        MutableList<String> ms = new MutableList<String>();
        ms.addFirst("hello");
        ms.addFirst("hello");

        //ms.addFirst(new Course("a", 2)); // Error!  Can't have different types in the same list
        // (unless they implemented the same interface--here they're totally different
        // ie, String vs. Course)

        MutableList<Course> cs = new MutableList<Course>();
        cs.addFirst(new Course("a", 2));
    }
}
