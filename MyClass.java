//class.java
public class MyClass {
    // Fields (Variables)
    private int instanceVar; // Instance variable
    private static int staticVar; // Static variable

    // Constructor
    public MyClass(int value) {
        this.instanceVar = value;
    }

    // Method
    public void display() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    // Static Method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Getter Method
    public int getInstanceVar() {
        return instanceVar;
    }

    // Setter Method
    public void setInstanceVar(int value) {
        this.instanceVar = value;
    }

    // Static Block
    static {
        staticVar = 16; // Initialize static variable
        System.out.println("Static block executed.");
    }

    // Main Method
    public static void main(String[] args) {
        MyClass obj = new MyClass(5); // Create an instance
        obj.display(); // Call instance method
        MyClass.staticMethod(); // Call static method
    }
}
