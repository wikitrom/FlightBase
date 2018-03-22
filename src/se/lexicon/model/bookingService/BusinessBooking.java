

package se.lexicon.model.bookingService;

import java.util.Date;

import java.util.GregorianCalendar;


public class BusinessBooking {

	private int bookingID;
	private Customer customer;
	private BusinessClass seat;

	private Date bookingDate;
	
	
	
	public BusinessBooking(int bookingID, Customer customer, BusinessClass seat) {
		super();
		this.bookingID = bookingID;
		this.customer = customer;
		this.seat = seat;
	
		
		GregorianCalendar gCal= new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_MONTH, 14);
		this.bookingDate=gCal.getTime();
		
	}

	@Override
	public String toString() 
	{
	return  bookingID +"         "+seat.getFlightNumber()+"         "+customer.getTicketClass()+ "     " + seat.getSeatNumber()+"           " + customer.getName()+"           "+getBookingDate();
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessBooking other = (BusinessBooking) obj;
		if (bookingID != other.bookingID)
			return false;
		return true;
	}

	public Customer getCustomer() {
		return customer;
	}

	public BusinessClass getSeat() {
		return seat;
	}
	
	public Date getBookingDate() {
		
		return bookingDate;
	}
	
	

	
	
}
