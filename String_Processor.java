/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
import java.util.Scanner;

public class StringProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter a String: ");
            String str = sc.nextLine();

         
            System.out.println("Substring: " + str.substring(0, 5));

         
            System.out.println("Character at index 10: " + str.charAt(10));

        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid String Index");
        }

        sc.close();
    }
}
