package models;

public class BusinessClass extends Airline{

		
		private int seatNumber;
		private String seatType="Business Class";
		
		
		public BusinessClass(String flightNumber, int seatNumber) {
			super(flightNumber, 20000);
			
			
			this.seatNumber=seatNumber;
			
		}

		

		public int getSeatNumber() {
			return seatNumber;
		}

		

		
		
			

	}

	
