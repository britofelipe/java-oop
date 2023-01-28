package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Worker worker = new Worker();
		
		System.out.print("Name: ");
		worker.name = sc.nextLine();
		System.out.print("Gross salary: ");
		worker.grossSalary = sc.nextDouble();
		System.out.print("Taxes: ");
		worker.taxes = sc.nextDouble();
		
		System.out.println();
		System.out.println("Worker: " + worker);
		
		System.out.print("Which percentage do you want to increase salary? ");
		double percentage = sc.nextDouble();
		worker.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + worker);
		
		sc.close();
	}

}
	