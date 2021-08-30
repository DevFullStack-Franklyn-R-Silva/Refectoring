package entities;

public class Invoice {
	private float tax;
	private float value;
	private String customer;

	public Invoice() {}
	public Invoice(float tax, float value, String customer) {
		this.tax = tax;
		this.value = value;
		this.customer = customer;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	


}
