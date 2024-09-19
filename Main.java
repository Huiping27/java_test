// this program demonstates a simple use of if to modify the value of two varaibles, x and y.

public class Main {
    public static void main(String[] args) {
        int x = 5; // Initialize x to 5
        int y = 10; // Initialize y to 10

        if (x < y) { // Check if x is less than y
            x = y; // Set x to the value of y
            y = 0; // Set y to 0
        } // End of the if block

        // Print the values of x and y
        System.out.println("x = " + x + ", y = " + y); // Output will be "x = 10, y = 0"
    }
}
