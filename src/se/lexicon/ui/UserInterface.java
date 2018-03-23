package se.lexicon.ui;

import java.util.Scanner;

import se.lexicon.model.GenderType;
import se.lexicon.model.TicketType;
import se.lexicon.model.bookingService.BusinessBooking;
import se.lexicon.model.bookingService.BusinessBookingRegistry;
import se.lexicon.model.bookingService.BusinessClass;
import se.lexicon.model.bookingService.BusinessClassSeatList;
import se.lexicon.model.bookingService.Customer;
import se.lexicon.model.bookingService.EconomyBooking;
import se.lexicon.model.bookingService.EconomyBookingRegistry;
import se.lexicon.model.bookingService.EconomyClass;
import se.lexicon.model.bookingService.EconomyClassSeatList;
import se.lexicon.model.foodService.Kitchen;
import se.lexicon.model.foodService.Meal;

public class UserInterface {

	// mats: fooodService objects
	Kitchen kitchen = new Kitchen();
	Meal meal = new Meal();

	public BusinessBooking businessClassMethod(int n, int s, String business)

	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Customer Name: ");
		String bName = in.next();

		BusinessClassSeatList businessSeatList = new BusinessClassSeatList();
		BusinessBookingRegistry businessRegistry = new BusinessBookingRegistry();

		Customer a1 = new Customer("19" + n, bName, GenderType.Male, "Business Class");

		BusinessClass bSeat1 = new BusinessClass("Fl0005", s);

		// mats: create meal and add to BusinessBooking (ticket?)
		System.out.println();
		System.out.println("Please compose your meal");
		meal = kitchen.cookMeal(TicketType.BUSINESS);
		bSeat1.addToTotalMealPrice(meal.getTotalPrice());

		businessSeatList.addSeat(bSeat1);

		// mats: added meal to constructor
		BusinessBooking bBooking1 = new BusinessBooking(551 + s, a1, bSeat1, meal);
		businessRegistry.addBooking(bBooking1);

		System.out.println();
		System.out.println("BookingID   FlightNumber   Ticket Class       Seat Number  Customer Name   Booking Date");
		System.out.println(bBooking1);
		
				// mats: print booked meal and price
		System.out.println("Ticket price: " + bSeat1.getPrice() + " SEK");
		System.out.println("Booked meal:");
		meal.getMeal().forEach((k, v) -> System.out.println("- " + k + " (price: " + v + " SEK]"));
		System.out.println("  Meal total price: " + meal.getTotalPrice());
		System.out.println("----------------------------------");
		System.out.println("Total price: " + (meal.getTotalPrice() + bSeat1.getPrice()) + " SEK");

		return bBooking1;
	}

	public EconomyBooking economyClassMethod(int y, int z, String economy)

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Customer Name: ");
		String eName = scan.next();

		EconomyClassSeatList economySeatList = new EconomyClassSeatList();
		EconomyBookingRegistry economyRegistry = new EconomyBookingRegistry();

		Customer f6 = new Customer("19" + y, eName, GenderType.Male, "Economy Class");
		EconomyClass eSeat6 = new EconomyClass("Fl0005", z);

		// mats: create meal and add to BusinessBooking (ticket?)
		System.out.println();
		System.out.println("Please compose your meal");
		meal = kitchen.cookMeal(TicketType.ECONOMY);
		eSeat6.addToTotalMealPrice(meal.getTotalPrice());

		economySeatList.addSeat(eSeat6);

		// mats: added meal to constructor
		EconomyBooking eBooking6 = new EconomyBooking(556 + y, f6, eSeat6, meal);

		economyRegistry.addBooking(eBooking6);

		System.out.println();
		System.out.println("BookingID   FlightNumber   Ticket Class       Seat Number  Customer Name   Booking Date");
		System.out.println(eBooking6);
	
		// mats: print booked meal and price
		System.out.println("Ticket price: " + eSeat6.getPrice() + " SEK");
		System.out.println("Booked meal:");
		meal.getMeal().forEach((k, v) -> System.out.println("- " + k + " (price: " + v + " SEK]"));
		System.out.println("  Meal total price: " + meal.getTotalPrice());
		System.out.println("----------------------------------");
		System.out.println("Total price: " + (meal.getTotalPrice() + eSeat6.getPrice()) + " SEK");
		
		return eBooking6;
	}

}
