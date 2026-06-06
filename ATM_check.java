/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/

import java.util.InputMismatchException;
import java.util.Scanner;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class ATMSystem {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException, NegativeAmountException {

        if (amount < 0) {
            throw new NegativeAmountException("Invalid Input");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        System.out.println("Transaction Successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            withdraw(balance, amount);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
