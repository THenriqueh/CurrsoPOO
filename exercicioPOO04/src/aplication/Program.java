package aplication;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.price(amount, dollar);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		sc.close();
	}

}
