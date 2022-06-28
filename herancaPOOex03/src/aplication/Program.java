package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import products.ImportedProduct;
import products.Product;
import products.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch (ch) {
			case 'c':
				sc.nextLine();
				list.add(new Product(name, price));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			case 'u':
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
				break;
			}

		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
