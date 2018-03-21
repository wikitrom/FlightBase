package ui;

import java.util.Scanner;

import models.BusinessBooking;
import models.BusinessBookingRegistry;
import models.BusinessClass;
import models.BusinessClassSeatList;
import models.Customer;
import models.EconomyBooking;
import models.EconomyBookingRegistry;
import models.EconomyClass;
import models.EconomyClassSeatList;
import utilities.GenderType;
import java.util.Scanner;
public class UserInterface 
{
	
	
	void businessClassMethod(int n,int s,String business)
	
	{
		
		Scanner in= new Scanner(System.in);
	    
	   
	    
	    System.out.print("Enter Customer Name: "); 
	    String bName = in.next();

	   	
		
		BusinessClassSeatList businessSeatList = new BusinessClassSeatList();
		BusinessBookingRegistry businessRegistry=new BusinessBookingRegistry();

		Customer a1 =new Customer("19"+n, bName,GenderType.Male,"Business Class");
		
		
		BusinessClass bSeat1=new BusinessClass("Fl0005",  s);		
	
		
		businessSeatList.addSeat(bSeat1);
		
		
		BusinessBooking bBooking1=new BusinessBooking(551+s,a1,bSeat1);
		
		
		businessRegistry.addBooking(bBooking1);
		System.out.println("BookingID   FlightNumber   Ticket Class       Seat Number  Customer Name   Booking Date");
		System.out.println(bBooking1);
		
	//	for(BusinessBooking b:businessRegistry) {}
	
		
	}
	
	
	
	
	void economyClassMethod(int y,int z,String economy)
	
	{
		Scanner scan= new Scanner(System.in);
	    
		 
	    
	    System.out.print("Enter Customer Name: "); 
	    String eName = scan.next();

	   
	  	
	    EconomyClassSeatList economySeatList = new EconomyClassSeatList();
		EconomyBookingRegistry economyRegistry=new EconomyBookingRegistry();
		
		
		Customer f6 =new Customer("19"+y, eName,GenderType.Male,"Economy Class");	
		EconomyClass eSeat6=new EconomyClass("Fl0005",  z);	
		
			
		economySeatList.addSeat(eSeat6);
		
		
		EconomyBooking eBooking6=new EconomyBooking(556+y,f6,eSeat6);
		
		
		economyRegistry.addBooking(eBooking6);
		
		System.out.println("BookingID   FlightNumber   Ticket Class       Seat Number  Customer Name   Booking Date");					
		System.out.println(eBooking6);
	
	}
	
	
	
    
	
	

}
