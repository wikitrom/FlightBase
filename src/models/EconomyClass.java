package models;

public class EconomyClass extends Airline  {

		
	private int seatNumber;
	private String seatType="Economy Class";
	
	
	public EconomyClass(String flightNumber, int seatNumber) {
		super(flightNumber, 5000);
		
		
		this.seatNumber=seatNumber;
		
	}

	

	public int getSeatNumber() {
		return seatNumber;
	}

	

	
	
	
		

}
