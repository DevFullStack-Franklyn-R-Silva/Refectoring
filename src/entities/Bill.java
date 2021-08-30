package entities;

public class Bill extends Invoice {
	
	
	public Bill() {
		super();
	}
	public String print(Invoice invoice) {
		//	calculate
		float amount = invoice.getValue() * invoice.getTax();
		//	print details
		String s = "";
		s+= invoice.getCustomer();
		s+=" $ "+ String.format("%.2f", amount);
		return s;
	}
}
