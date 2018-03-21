package ui;

import models.EconomyClass;


import models.EconomyClassSeatList;

import models.Customer;
import models.EconomyBooking;

import java.util.Scanner;


import models.Airline;

import models.EconomyBookingRegistry;
import models.BusinessBooking;
import models.BusinessBookingRegistry;
import models.BusinessClass;
import models.BusinessClassSeatList;
import utilities.GenderType;
import ui.*;

public class MainClass {

	static int bClassSeats=0;
	static int eClassSeats=0;
	static int i=1,j=6;
	
	public static void main(String[] args) {

		UserInterface ui=new UserInterface();
		
		for (int x=0;x<4;x++)
		{
			
			System.out.println("\nWrite down ticket class or exit to cancel.\n1- Business \n2- Economy\n3- Exit");
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			
			
			if(str.equalsIgnoreCase("business")) 
			{
				if (bClassSeats<2) 
				{
							
				  ui.businessClassMethod(500+i,i++,"Business");
				  bClassSeats++;
				}
				
				else {
					System.out.println("Business class is full would you like to book ticket in Econmy Class write yes or exit");
					str=scan.next();
					if(str.equalsIgnoreCase("yes"))
					{
						ui.economyClassMethod(500+j,j++,"Economy");
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
					ui.economyClassMethod(500+j,j++,"Economy");	
					eClassSeats++;
				}
				
				else {
					System.out.println("Economy Class is full Would you like to book ticket in Business Class write yes or exit");
					str=scan.next();
					if(str.equalsIgnoreCase("yes"))
					{
						ui.businessClassMethod(500+i,i++,"Business");
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
		
			
		
		
		
		
	
		
		
		
		
		
		Airline airline=new Airline();
		System.out.println("\n"+"Total Cost Of Tickets :"+airline.getTotal()+" SEK");
		System.out.println("Total Profit :"+airline.getProfit()+" SEK");
		
		
	}
}
	
	




