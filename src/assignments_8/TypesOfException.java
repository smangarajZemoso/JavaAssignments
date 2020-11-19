package assignments_8;

public class TypesOfException {


    public static void testExceptions() {
        try {
            int a = 30, b = 0;
            int c = a / b;  // cannot divide by zero
            System.out.println("Result = " + c);
            String ax = null; //null value
            System.out.println(ax.charAt(0));
            String as = "This is like chipping "; // length is 22
            char cd = as.charAt(24); // accessing 25th element
            System.out.println(cd);
        } catch (Exception e) {
            System.out.println("Exceptions Occurred");
        } finally {
            System.out.println("Finally Block is executed");
        }
    }

    public static void main(String args[]) {
        testExceptions();
//        try {
//            int a = 30, b = 0;
//            int c = a / b;  // cannot divide by zero
//            System.out.println("Result = " + c);
//        } catch (ArithmeticException e) {
//            System.out.println("Can't divide a number by 0");
//        }
//
//        try {
//            String a = null; //null value
//            System.out.println(a.charAt(0));
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException..");
//        }
//
//        try {
//            String a = "This is like chipping "; // length is 22
//            char c = a.charAt(24); // accessing 25th element
//            System.out.println(c);
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("StringIndexOutOfBoundsException");
//        }
    }

}
