package aplication;

import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Students student = new Students();
		Scanner sc = new Scanner(System.in);
	
		student.nome = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		
		if (student.nota()>60) {
			System.out.println(student.nome);
			System.out.printf("FINAL GRADE: %.2f%n", student.nota());
			System.out.println("PASS");
		}
		else {
			System.out.println(student.nome);
			System.out.printf("FINAL GRADE: %.2f%n", student.nota());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n", student.falta());
		}
		sc.close();
	}

}
