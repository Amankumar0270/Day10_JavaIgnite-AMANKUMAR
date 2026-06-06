/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            withdraw(balance, amount);

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
