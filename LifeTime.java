//demonstrate lifetime of a varaible. The lifetime begins when the block starts and ends when the block ends.Each time the loop interates,a new y is created and initialized to -1, and then its value is updated within the block.

class LifeTime {
    public static void main(String args[]) {
        int x;

        for( x = 0; x < 3 ; x ++) {
            int y = -1; // y is initialized each time block is entered 
            System.out.println("y is: " + y);
            y = 100;
            System.out.println("y is: " + y); // this always prints -1

            y = 100;
            System.out.println("y is now: " + y);

        }
    }
}