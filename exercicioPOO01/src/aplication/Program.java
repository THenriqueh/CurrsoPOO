package aplication;

import java.util.Scanner;

import entities.Retangle;

public class Program {
	public static void main(String[] args) {
		Retangle result = new Retangle();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		result.width = sc.nextDouble();
		result.height = sc.nextDouble();
		double area = result.area();
		double perimeter = result.perimeter();
	
		System.out.println("AREA = " + area);
		System.out.println();
		System.out.println("PERIMETER = " + perimeter);
		
		sc.close();
			
	}
}
