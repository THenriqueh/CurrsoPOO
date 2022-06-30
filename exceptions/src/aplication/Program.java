package aplication;

import java.util.Scanner;

import entities.Account;
import excepitions.BusinessException;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();	
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawlimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawlimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		System.out.println();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
