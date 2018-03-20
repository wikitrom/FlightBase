package flightBookingSystem;

import java.util.ArrayList;

public class BTicket extends Ticket {

	
	String businessClass="Business Class";
	final int price=20000;
	
	public BTicket(String flightNumber, String seatNumber, Customer c, String businessClass) {
		super(flightNumber, seatNumber, 20000);
		
		ArrayList<Customer> bCustomers = new ArrayList<>();
		bCustomers.add(c);
		
		this.businessClass = businessClass;
		
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return  getBusinessClass() + " Price=" + getPrice()
				+ "FlightNumber=" + getFlightNumber() + "SeatNumber=" + getSeatNumber() ;
	}
	
		
	

}
