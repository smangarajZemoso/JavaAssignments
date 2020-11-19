package assignments_5;

public class SingletonInitialization {
    String class_var_1;

    public static SingletonInitialization singleTon(String local_var_1) {
        // class_var_1 = "Can't be initialized"; non-static variables can't be initialized in static method
        return new SingletonInitialization();
    }

    void printStaticVariable() {
        System.out.println(class_var_1);
    }
}
