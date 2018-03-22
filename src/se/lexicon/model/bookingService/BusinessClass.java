package se.lexicon.model.bookingService;

public class BusinessClass extends Airline{

		
		private int seatNumber;
				
		public BusinessClass(String flightNumber, int seatNumber) {
			super(flightNumber, 20000);
			
			
			this.seatNumber=seatNumber;
			
		}

		

		public int getSeatNumber() {
			return seatNumber;
		}

		

		
		
			

	}

	
