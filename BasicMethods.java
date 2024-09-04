//BasicMethids.java: demonstrates how to define and call methods.
public class BasicMethods {
    public static void main(String[] args) {
        // Call the method
        int result = add (5,3);
        System.out.println("The result is: " + result);
    }
    // Define the method
    public static int add(int a, int b) {
        return a+b;
    }
}