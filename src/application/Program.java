package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Enter the account data:");

			System.out.print("Account Number: ");
			int number = in.nextInt();

			System.out.print("Holder: ");
			String name = in.next();

			System.out.print("Initial Balance: ");
			double balance = in.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = in.nextDouble();

			Account acc = new Account(number, name, balance, withdrawLimit);

			System.out.println();

			System.out.println("Choose an operation:");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Both Deposit and Withdraw");
			System.out.print("Your choice: ");
			int choice = in.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount for deposit: ");
				double depositAmount = in.nextDouble();
				acc.deposit(depositAmount);
				System.out.println("Deposit successful!");
				System.out.println("Updated Balance: " + String.format("%.2f", acc.getBalance()));
				break;

			case 2:
				System.out.print("Enter amount for withdraw: ");
				double withdrawAmount = in.nextDouble();
				try {
					acc.withdraw(withdrawAmount);
					System.out.println("Withdraw successful!");
					System.out.println("Updated Balance: " + String.format("%.2f", acc.getBalance()));
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				System.out.print("Enter amount for deposit: ");
				double depositAndWithdrawDepositAmount = in.nextDouble();
				acc.deposit(depositAndWithdrawDepositAmount);
				System.out.println("Deposit successful!");
				System.out.println("Updated Balance: " + String.format("%.2f", acc.getBalance()));

				System.out.print("Enter amount for withdraw: ");
				double depositAndWithdrawWithdrawAmount = in.nextDouble();
				try {
					acc.withdraw(depositAndWithdrawWithdrawAmount);
					System.out.println("Withdraw successful!");
					System.out.println("Updated Balance: " + String.format("%.2f", acc.getBalance()));
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				System.out.println("Invalid choice. Please choose a valid operation.");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input: Please enter the correct data type.");
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		} finally {
			in.close();
		}
	}
}