package assignments_5;

public class SingletonInitialization {
    String class_var_1;
    private static SingletonInitialization singletonInitialization = null;

    public static SingletonInitialization singleton(String local_var_1) {
        // class_var_1 = "Can't be initialized"; non-static variables can't be initialized in static method
        if (singletonInitialization == null) {
            singletonInitialization = new SingletonInitialization();
        }
        return singletonInitialization;
    }

    void printStaticVariable() {
        System.out.println(class_var_1);
    }
}
