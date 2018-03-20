package flightBookingSystem;

public class Customer {
	
	private int id;
	private String name;
	private String adress;
	private String mobilNumber;
	
	
	public Customer(int id, String name, String adress, String mobilNumber) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.mobilNumber = mobilNumber;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer id=" + id + "\nname=" + name + "\nadress=" + adress + "\nmobilNumber=" + mobilNumber;
	}

	
}
