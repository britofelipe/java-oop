package entities;

public class Worker {
	public String name;
	public double grossSalary;
	public double taxes;
	
	public double netSalary() {
		return grossSalary - taxes;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary *=  ((percentage / 100) + 1); 
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
}
