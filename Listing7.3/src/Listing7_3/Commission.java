package Listing7_3;

public class Commission extends Hourly {
	
	private double totalSales;
	private double commissionRate; // 0.20 = 20% 0.15 means 15%

	// Hourly (name, addess, phone #, social security number
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double commissionRate) {
			super (eName, eAddress, ePhone, socSecNumber, commissionRate);
		
		this.commissionRate = commissionRate;
		
	}
	// totalSales =totalSales + additionalSales - used in place of : public void addSales (double totalSales)
	public void addSales (double additionalSales) {
		totalSales += additionalSales; 
	}
	
	public double pay() {
		double amount = super.pay() + (totalSales * commissionRate);
		totalSales = 0.0;
		return amount;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}
	
}