@SuppressWarnings("ReassignedVariable")
public class Lec09 {

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

    public static void courseExample() {
        Course visa = new Course("visa120", 18);
        IList<Course> C1 = new EmptyList<Course>(); // NOTE -- IMMUTABLE LIST
        C1 = C1.addFirst(new Course("csci200", 470));
        C1 = C1.addFirst(visa);
        visa.enroll();

        // what do we expect to see here?
        System.out.println(C1);
    }

    public static void main(String[] args) {
        // equalityExample();
        // courseExample();
    }
}
