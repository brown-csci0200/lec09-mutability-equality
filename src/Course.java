package src;

public class Course {
    private String name;
    private int enrolled;

    public Course(String n, int e) {
        this.name = n;
        this.enrolled = e;
    }

    public void enroll() {
        this.enrolled = this.enrolled + 1;
    }

    public void drop() {
        this.enrolled = this.enrolled - 1;
    }

}
