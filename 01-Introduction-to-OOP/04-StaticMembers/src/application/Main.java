package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price in euros? ");
		Dollar.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.print("Amount to be paid in euros: ");
		System.out.println(Dollar.convertAndDeductTaxes(amount));
		
		sc.close();
	}
}	
