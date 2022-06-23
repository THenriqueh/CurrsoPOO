package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Pedro");
		list.add("Thallis");
		list.add("Henrique");
		list.add(2, "Bob");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		System.out.println("Index of  bob " + list.indexOf("Bob"));
		System.out.println("Index of pedro " + list.indexOf("Pedro"));

		System.out.println("-----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
	}
}
