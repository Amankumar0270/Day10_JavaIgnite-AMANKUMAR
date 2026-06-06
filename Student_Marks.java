/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMarksSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = {78, 85, 90, 67, 88};

        try {

            System.out.print("Enter index (0 to 4): ");
            int index = sc.nextInt();

            System.out.println("Student Mark: " + marks[index]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
