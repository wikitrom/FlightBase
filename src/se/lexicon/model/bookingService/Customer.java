package se.lexicon.model.bookingService;

import java.util.GregorianCalendar;

import se.lexicon.model.GenderType;



public class Customer {

	private String id;
	private String firstname;
	private GenderType gender;
	private String ticketClass;
	
	
	
	
	public Customer(String id,String firstname, GenderType gender,String ticketClass) {
	this.id=id;
	this.firstname=firstname;
	this.gender=gender;
	this.ticketClass=ticketClass;
		
	GregorianCalendar gCal= new GregorianCalendar();
	gCal.add(GregorianCalendar.YEAR, 1);
	
	
	
	}
	

    public String getId() {
		return id;
	}

	 public String getName() {
		return firstname;
	}

	 public GenderType getGender() {
		return gender;
	}


public String getTicketClass() {
		return ticketClass;
	}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (gender != other.gender)
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return false;
	
	
	
}




}
