// below code demonstrates how modifying variables affects the evaluation of if statements and the resulting output.

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        // Check if x is less than y
        if (x < y) {
            System.out.println("x is less than y");
            // You can add more statements here if needed
            System.out.println("This is an additional statement in the x < y block.");
        }

        x = x * 2;

        // Check if x is now equal to y
        if (x == y) {
            System.out.println("x now equals y");
            // Additional statements for x == y
            System.out.println("This is an additional statement in the x == y block.");
        }

        x = x * 2;

        // Check if x is now greater than y
        if (x > y) {
            System.out.println("x now greater than y");
            // Additional statements for x > y
            System.out.println("This is an additional statement in the x > y block.");
        }

        // This block will not display anything because the condition is false
        if (x == y) {
            System.out.println("You won't see this");
            // Additional statements for x == y (again)
            System.out.println("This statement is in the final x == y block.");
        }
    }
}



