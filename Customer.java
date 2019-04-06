

public class Customer {

	private int id;
	private static String first_name;
	private String last_name;
	private double balance;

	public Customer(int id, String first_name, String last_name, double balance) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.balance = balance;
	}

	public String getFirstName() {
		
		return first_name;

	}

	public String getLastName() {
		return last_name;

	}

	public double getBalance() {
		return balance;

	}

	public int getId() {
		return id;
	}
}
