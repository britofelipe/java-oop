package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n): ");
		char option = sc.next().charAt(0);
		
		Account account;
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			account = new Account(number, name, amount);
		} else {
			account = new Account(number, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
