package models;

import java.util.HashMap;
import java.util.TreeMap;

public class BusinessClassSeatList {

	
	private TreeMap<String, BusinessClass> businessSeatMap;
	
	public BusinessClassSeatList() 
	{
		
		businessSeatMap= new TreeMap<String,BusinessClass>();
		
	}
	
	
		public TreeMap<String,BusinessClass> getSeatMap() 
			{
				
				return businessSeatMap;
	    	}

		
		public int getNumberOfSeats() 
			{
				return businessSeatMap.size();
				
			}

		public void addSeat(BusinessClass  newSeat) 
			{
				
				businessSeatMap.put(newSeat.getFlightNumber(),newSeat );
				
				
			}

	
		


}
