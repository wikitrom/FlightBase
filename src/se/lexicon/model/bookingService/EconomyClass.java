package se.lexicon.model.bookingService;

public class EconomyClass extends Airline  {

		
	private int seatNumber;
	
	
	public EconomyClass(String flightNumber, int seatNumber) {
		super(flightNumber, 5000);  // 5000 = ticketPrice
		
		
		this.seatNumber=seatNumber;
		
	}

	

	public int getSeatNumber() {
		return seatNumber;
	}

	

	
	
	
		

}
