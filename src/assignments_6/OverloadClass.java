package assignments_6;

public class OverloadClass {

    public OverloadClass(int local_1) {
        System.out.println(local_1);
    }

    public OverloadClass(int local_1, int local_2) {
        this(local_1);
        System.out.println(local_2);
    }

    public static void main(String[] args) {
        new OverloadClass(12,45);
    }
}
