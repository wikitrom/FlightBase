package flightBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	protected String flightNumber;
	protected String seatNumber;
	public static int total=0;
	int price;

	
	
	
	public Ticket(String flightNumber, String seatNumber, int price) {
	
	
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;
		this.price=price;
		total=total+this.price;
	}

	public Ticket()
	{
		
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	

	public  int getTotal() {
		return total;
	}
	

	
	
}
