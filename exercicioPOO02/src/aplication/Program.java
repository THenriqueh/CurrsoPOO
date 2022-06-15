package aplication;

import java.util.Scanner;

import infos.DataEmployers;

public class Program {
	public static void main(String[] args) {
		DataEmployers data = new DataEmployers();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome:");
		data.name = sc.nextLine();
		System.out.print("Gross salary: ");
		data.grossSalary = sc.nextDouble();
		System.out.print("tax; ");
		data.tax = sc.nextDouble();
		System.out.printf("Employee: " + data);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double newSalary = sc.nextDouble();
		data.increaseSalary(newSalary);
		System.out.println();
		System.out.printf("Updated data: " + data);
		
		sc.close();
	}

}
