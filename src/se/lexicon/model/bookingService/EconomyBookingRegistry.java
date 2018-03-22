package se.lexicon.model.bookingService;

import java.util.ArrayList;


public class EconomyBookingRegistry {

	private ArrayList<EconomyBooking> registry;
	
	
	public EconomyBookingRegistry(){
		
		registry=new ArrayList<EconomyBooking>();
		
		
	}
	
	public void addBooking(EconomyBooking booking)
	{
		
	
			registry.add(booking);
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
