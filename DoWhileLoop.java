//Do-While Loop
//Do-While Loop is a control flow statement that executes a block of code repeatedly until a specific conditions is met.
//it is similar to the while loop, but it ensures that the code block is executed at least once before checking the condition.
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
        } while (i < 5);
        i++;
    }
}