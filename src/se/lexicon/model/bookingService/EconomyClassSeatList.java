package se.lexicon.model.bookingService;

import java.util.TreeMap;

public class EconomyClassSeatList {

	
	private TreeMap<String, EconomyClass> economySeatMap;
	
	public EconomyClassSeatList() 
	{
		
		economySeatMap= new TreeMap<String,EconomyClass>();
		
	}
	
	
		public TreeMap<String,EconomyClass> getSeatMap() 
			{
				
				return economySeatMap;
	    	}

		
		public int getNumberOfSeats() 
			{
				return economySeatMap.size();
				
			}

		public void addSeat(EconomyClass  eSeat) 
			{
				
				economySeatMap.put(eSeat.getFlightNumber(),eSeat );
				
				
			}

	
		


}
