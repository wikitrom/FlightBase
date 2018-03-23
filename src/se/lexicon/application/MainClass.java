package se.lexicon.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import se.lexicon.model.bookingService.Airline;
import se.lexicon.model.bookingService.BusinessBooking;
import se.lexicon.model.bookingService.BusinessBookingRegistry;
import se.lexicon.model.bookingService.EconomyBooking;
import se.lexicon.ui.UserInterface;

public class MainClass {

	static int bClassSeats = 0;
	static int eClassSeats = 0;
	static int bSeatStart = 1, eSeatStart = 6;
	final static int limit = 10;
	final static int bLimit = 5;
	final static int eLimit = 5;
	static int countBookings = 0;

	public static void main(String[] args) {

		UserInterface ui = new UserInterface();

		ArrayList<BusinessBooking> bBookings = new ArrayList<>();
		ArrayList<EconomyBooking> eBookings = new ArrayList<>();
		BusinessBooking[] bBooking;
		EconomyBooking[] eBooking;
		Airline airline = new Airline();
		boolean notExit = true;

		do {
			Scanner scan = new Scanner(System.in);

			if (countBookings >= limit) {
				System.out.println();
				System.out.println(
						"\nFlight is full! no more booking Possible!\n - Bookings\n - Finances\n- Exit");
			} else {
				System.out.println();
				System.out.println("Current number or bookings:");
				System.out.println("Business class: " + bClassSeats + " (left: " + (bLimit - bClassSeats)
						+ ") | Economy Class: " + eClassSeats + " (left: " + (eLimit - eClassSeats) + ")");
				System.out.println(
						"\nWhich type of ticket class do you want to buy? \n- Business \n- Economy\n- Bookings\n- Finances\n- Exit");
			}

			String str = scan.next();

			if (countBookings < limit) {
				if (str.equalsIgnoreCase("business")) {
					if (bClassSeats < bLimit) {

						bBookings.add(ui.businessClassMethod(500 + bSeatStart, bSeatStart++, "Business"));
						bClassSeats++;
						countBookings++;
					} else {
						System.out.println(
								"Business class is full. Would you like to book ticket in Economy Class? write yes or no");
						str = scan.next();
						if (str.equalsIgnoreCase("yes")) {
							eBookings.add(ui.economyClassMethod(500 + eSeatStart, eSeatStart++, "Economy"));
							eClassSeats++;
							countBookings++;
						}
					}
				} else if (str.equalsIgnoreCase("economy")) {
					if (eClassSeats < eLimit) {
						eBookings.add(ui.economyClassMethod(500 + eSeatStart, eSeatStart++, "Economy"));
						eClassSeats++;
						countBookings++;
					}

					else {
						System.out.println(
								"Economy class is full. Would you like to book ticket in BusinessClass? write yes or no");
						str = scan.next();
						if (str.equalsIgnoreCase("yes")) {
							bBookings.add(ui.businessClassMethod(500 + bSeatStart, bSeatStart++, "Business"));
							bClassSeats++;
							countBookings++;
						}
					}

				}
			}

			if (str.equalsIgnoreCase("exit")) {
				scan.close();
				notExit = false;
			}

			if (str.equalsIgnoreCase("bookings")) {
				// mats: emergency solution - perception is everything :-)
				System.out.println();
				System.out.println("Current bookings:");
				System.out.println(
						"BookingID   FlightNumber   Ticket Class       Seat Number  Customer Name   Booking Date");

				bBookings.forEach(System.out::println);
				eBookings.forEach(System.out::println);
			}

			if (str.equalsIgnoreCase("finances")) {
				System.out.println("\n" + "Total income (Tickets+Meals): " + airline.getTotal() + " SEK");
				System.out.println("Total Profit: " + airline.getProfit() + " SEK");

			}

		} while (notExit);


	}
}
