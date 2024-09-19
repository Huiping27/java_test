
//Demonstrate char data type.
public class Char_variables {public static void main(String args[]){
    char ch1, ch2;

    ch1= 88; // code for X
    ch2= 'Y';

 
    System.out.print("ch1 and ch2: "); // here print the string
    System.out.println(ch1 + " " + ch2); // here java handles the concatenation

    // Print the Unicode/ASCII values of ch1 and ch2
    System.out.println((int)ch1 + " " + (int)ch2);
}

}
