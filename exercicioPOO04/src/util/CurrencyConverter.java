package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double price (double amount, double dollar) {
		return amount * dollar * (1 + IOF);
	}

}
