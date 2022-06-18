package aplication;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Account account;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char escolha = sc.next().charAt(0);
		double initialDeposit;
		if(escolha == 'y') {
			System.out.println("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
			
		}else {
			account = new Account(number, name);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();

	}

}
