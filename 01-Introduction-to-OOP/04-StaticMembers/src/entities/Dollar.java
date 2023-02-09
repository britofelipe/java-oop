package entities;

public class Dollar {
	public static double price;
	
	public static double convertAndDeductTaxes(double amount) {
		return (amount * price) * 1.06;
	}
}
