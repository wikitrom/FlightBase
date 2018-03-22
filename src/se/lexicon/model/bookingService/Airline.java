package se.lexicon.model.bookingService;

public class Airline {
	
	private String flightNumber;
	
	
	private Customer customer;
	private static int total;
	private int price=0;
	
	
	public Airline(String flightNumber, int price) {
	
		this.flightNumber = flightNumber;
		
		this.price=price;
		total=total+this.price;
	}

	public Airline() {
		
	}

	public String getFlightNumber() {
		return flightNumber;
	}

		
	public boolean equals(Object obj) {
		
		if(obj==null)
		{
			return false;
		}
		
		if(getClass() ==obj.getClass())
		{
			Airline otherClass=(Airline)obj;
			if (flightNumber==otherClass.flightNumber) {
				return true;
			}
			else  return false;
		}
		else
		return false;
		
		
	}

	public static int getTotal() {
		return total;
	}

	public double getProfit() {
		
		return (total*0.30);
	}
	
	
	
}
