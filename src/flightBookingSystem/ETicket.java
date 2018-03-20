package flightBookingSystem;

import java.util.ArrayList;

public class ETicket extends Ticket {

	
	 String economyClass="Economy Class";
	
	
	 public ETicket(String flightNumber, String seatNumber, Customer ce, String economyClass) {
		super(flightNumber, seatNumber,5000);
		
		ArrayList<Customer> eCustomers = new ArrayList<>();
		
		eCustomers.add(ce);
		
		this.economyClass = economyClass;
		
	}

	public String getEconomyClass() {
		return economyClass;
	}

	public int getPrice() {
		return price;
	}
	
	
}
