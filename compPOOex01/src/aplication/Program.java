package aplication;

import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enuns.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String depName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Nmae: ");
		String workerName = sc.nextLine();
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Departament departament = new Departament(depName);
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, departament);
		System.out.print("How many contracts to this worker? ");
		int quantity = sc.nextInt();

		sc.close();

	}

}
