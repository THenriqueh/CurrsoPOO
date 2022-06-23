package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("This id already exist taken! Try Again:");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		for (Employee emp : list) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Enter the employee id that will have salary increase : ");
		System.out.println();
		int idSalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// Integer pos = position(list, idSalary);
		if (emp == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.println("Enter the percetage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);

		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee empl : list) {
			System.out.println(empl);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
