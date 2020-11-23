package assignments_5;

public class Main {
    public static void main(String[] args) {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        defaultInitialization.printClassVariable();
        defaultInitialization.printLocalVariable(12,'C');
        SingletonInitialization singletonInitialization = SingletonInitialization.singleton("Sacrifice");
        singletonInitialization.printStaticVariable();
    }
}
