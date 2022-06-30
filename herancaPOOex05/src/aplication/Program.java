package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			switch (ch) {
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			}

		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tax : list) {
			System.out.printf(tax.getName() + ": $ %.2f%n", tax.tax());
		}
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp: list) {
			sum += tp.tax();
		}
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		

		sc.close();
	}

}
