package se.lexicon.model.bookingService;

public class Airline {
	
	private String flightNumber;
	
	private static int totalTicketPrice = 0;
	private static int totalMealPrice = 0;
	private int price=0;
	
	
	public Airline(String flightNumber, int price) {
	
		this.flightNumber = flightNumber;
		
		this.price=price;
		totalTicketPrice=totalTicketPrice+this.price;
	}

	public Airline() {
		
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public int getPrice() {
		return price;
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
		return totalTicketPrice + totalMealPrice;
	}

	public double getProfit() {
		
		return (getTotal() * 0.30);
	}
	
	public void addToTotalMealPrice (int mealPrice) {
		totalMealPrice += mealPrice;
	}
	
}
