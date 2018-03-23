package se.lexicon.application;

import java.util.Scanner;

import se.lexicon.model.bookingService.Airline;
import se.lexicon.ui.UserInterface;

public class MainClass {

	static int bClassSeats = 0;
	static int eClassSeats = 0;
	static int bSeatStart = 1, eSeatStart = 6;
	final static int limit=10;
	final static int bLimit=5;
	final static int eLimit=5;
	

	public static void main(String[] args) {

		UserInterface ui = new UserInterface();

		for (int x = 0; x < limit; x++) {

			System.out.println(
					"\nWhich type of ticket class do you want to buy? Enter 'exit' to cancel.\n- Business \n- Economy\n- Exit");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();

			if (str.equalsIgnoreCase("business")) {
				if (bClassSeats < bLimit) {

					ui.businessClassMethod(500 + bSeatStart, bSeatStart++, "Business");
					bClassSeats++;
				}

				else {
					System.out.println(
							"Business class is full would you like to book ticket in Econmy Class write yes or exit");
					str = scan.next();
					if (str.equalsIgnoreCase("yes")) {
						ui.economyClassMethod(500 + eSeatStart, eSeatStart++, "Economy");
					} else {
						Airline airline = new Airline();
						System.out.println("\n" + "Total income (Tickets+Meals): " + airline.getTotal() + " SEK");
						System.out.println("Total Profit: " + airline.getProfit() + " SEK");
						System.exit(0);
					}
				}
			} else if (str.equalsIgnoreCase("economy")) {
				if (eClassSeats < eLimit) {
					ui.economyClassMethod(500 + eSeatStart, eSeatStart++, "Economy");
					eClassSeats++;
				}

				else {
					System.out.println(
							"Economy Class is full Would you like to book ticket in Business Class write yes or exit");
					str = scan.next();
					if (str.equalsIgnoreCase("yes")) {
						ui.businessClassMethod(500 + bSeatStart, bSeatStart++, "Business");
					} else {
						Airline airline = new Airline();
						System.out.println("\n" + "Total income (Tickets+Meals): " + airline.getTotal() + " SEK");
						System.out.println("Total Profit: " + airline.getProfit() + " SEK");
						System.exit(0);
					}

				}

			} else if (str.equalsIgnoreCase("exit")) {
				scan.close();
				Airline airline = new Airline();
				System.out.println("\n" + "Total income (Tickets+Meals): " + airline.getTotal() + " SEK");
				System.out.println("Total Profit: " + airline.getProfit() + " SEK");

				System.exit(0);
			}

		}

		System.out.println("\nFlight is full! no more booking Possible");

		Airline airline = new Airline();
		System.out.println("\n" + "Total income (Tickets+Meals): " + airline.getTotal() + " SEK");
		System.out.println("Total Profit: " + airline.getProfit() + " SEK");

	}
}
