package se.lexicon.model.bookingService;

import java.util.Date;

import java.util.GregorianCalendar;


public class EconomyBooking {

	private int bookingID;
	private Customer customer;
	private EconomyClass seat;

	private Date bookingDate;
	
	
	
	public EconomyBooking(int bookingID, Customer customer, EconomyClass seat) {
		super();
		this.bookingID = bookingID;
		this.customer = customer;
		this.seat = seat;
	
		
		GregorianCalendar gCal= new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_MONTH, 14);
		this.bookingDate=gCal.getTime();
		
	}

	@Override
	public String toString() {
		
		return  bookingID +"         "+seat.getFlightNumber()+"         "+customer.getTicketClass()+ "      " + seat.getSeatNumber()+"           " + customer.getName()+"         "+getBookingDate();
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EconomyBooking other = (EconomyBooking) obj;
		if (bookingID != other.bookingID)
			return false;
		return true;
	}

	public Customer getCustomer() {
		return customer;
	}

	public EconomyClass getSeat() {
		return seat;
	}
	
	public Date getBookingDate() {
		
		return bookingDate;
	}
	
	
	
	
}
