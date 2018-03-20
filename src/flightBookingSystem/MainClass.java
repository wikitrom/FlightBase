package flightBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	static int bClassSeats=0;
	static int eClassSeats=0; 
	
	
	
	
	public static void main(String[] args) {
		
		
		
	for (int x=0;x<4;x++)
	{
		
		System.out.println("\nWrite down ticket class or exit to cancel.\n1- Business \n2- Economy\n3- Exit");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		
		if(str.equalsIgnoreCase("business")) 
		{
			if (bClassSeats<2) 
			{
						
			   businessClassMethod();
			}
			
			else {
				System.out.println("Business class is full would you like to book ticket in Econmy Class write yes or exit");
				str=scan.next();
				if(str.equalsIgnoreCase("yes"))
				{
					economyClassMethod();
				}
				else
				{
					System.exit(0);
				}
				
			} 
				
				
		}
		else if(str.equalsIgnoreCase("economy"))
		{
			if (eClassSeats<2) 
			{
				economyClassMethod();	
			  
			}
			
			else {
				System.out.println("Economy Class is full Would you like to book ticket in Business Class write yes or exit");
				str=scan.next();
				if(str.equalsIgnoreCase("yes"))
				{
					 businessClassMethod();
				}
				else
				{
					System.exit(0);
				}
				
			} 
			
		}
		else if(str.equalsIgnoreCase("exit")) {
			System.exit(0);
		}
	
	
	
	}
	
	System.out.println("\nFlight is full! no more booking Possible");
	
	Ticket t=new Ticket();
	System.out.println("Total Flight Tickets Price= "+t.getTotal());
	
	
	
	
	
	}
	
	static	void businessClassMethod()
	{
		
		
	    	
			Scanner in= new Scanner(System.in);
		    
		    System.out.print("Enter Customer id: ");
		    int id = in.nextInt();
		    
		    System.out.print("Enter Customer Name: "); 
		    String name = in.next();

		    System.out.print("Enter Customer Address: ");
		    String address = in.next();

		    System.out.print("Enter Customer mobile Number: ");
		    String mobile = in.next();
		
		
		Customer c=new Customer(id, name, address, mobile);
		
		BTicket bTicket=new BTicket("FL556", "002"+1,c, "businessClass");
		
		 ArrayList<Ticket> 	businessTicket = new ArrayList<>();
		businessTicket.add(bTicket);
		bClassSeats++;
		
	}
	
	static void economyClassMethod() {
		
		
		Scanner in= new Scanner(System.in);
	    
	    System.out.print("Enter Customer id: ");
	    int id = in.nextInt();
	    
	    System.out.print("Enter Customer Name: "); 
	    String name = in.next();

	    System.out.print("Enter Customer Address: ");
	    String address = in.next();

	    System.out.print("Enter Customer mobile Number: ");
	    String mobile = in.next();
	
	
	Customer ce=new Customer(id, name, address, mobile);
		
	ETicket eTicket=new ETicket("FL556", "006"+1,ce , "Economy Class");
	
	ArrayList<Ticket> economyTicket = new ArrayList<>();
	economyTicket.add(eTicket);
	eClassSeats++;
	
		
	}

}
