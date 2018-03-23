package se.lexicon.model.bookingService;

public class BusinessClass extends Airline{

		
		private int seatNumber;
				
		public BusinessClass(String flightNumber, int seatNumber) {
			super(flightNumber, 20000);   // 20000 = ticketPrice
			
			
			this.seatNumber=seatNumber;
			
		}

		

		public int getSeatNumber() {
			return seatNumber;
		}

		

		
		
			

	}

	
