1)Explain Java Exception hierarchy:

Throwable->this is happens in the  parents class of all errors and exception
eg 
Exception-> in which problem can be handled by the program
eg->ArithmeticException
Error-> sysetm problem which can not be handled 
eg->outofmemoryError

Give one example for each.


2)Can we have multiple catch blocks?
Explain with example when it is useful.

Yes, Java allows multiple catch blocks.

It is useful when different exceptions need different handling.

Example:
import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30};

        try {

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.println(arr[num]);

        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }

        catch(InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        catch(Exception e) {
            System.out.println("Some Error Occurred");
        }
    }
}

3)A program crashes when user enters text instead of number.

What exception occurs?
ans->InputMismatchException

How will you handle it?
handle by t
Ans->import java.util.*

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();

            System.out.println(num);
        }

        catch(InputMismatchException e) {
            System.out.println("Please enter numbers only");
        }
    }
}

Where should try-catch be placed?
Ans->try-catch should be placed around the risky code where exception may occur.

Example:

try {
    int num = sc.nextInt();
}
catch(InputMismatchException e) {

}



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output 
Ans-> erroe handle end

What prints first?
Ans->errr handled

Does program stop?
Ans->no



