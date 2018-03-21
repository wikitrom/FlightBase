

package models;

import java.util.ArrayList;



public class BusinessBookingRegistry  {

	private ArrayList<BusinessBooking> businessRegistry;

	
	public BusinessBookingRegistry(){
		
		businessRegistry=new ArrayList<BusinessBooking>();
		
		
	}
	
	public void addBooking(BusinessBooking booking)
	{
		
	
			businessRegistry.add(booking);
		
	
		
	}
	
		
}
