package models;

import java.util.HashSet;

public class CustomerRecords {
	
	private HashSet<Customer> records;

	
	public CustomerRecords() 
		{
			
			records= new HashSet<Customer>();
			
		}
	
	public void add(Customer customer) 
		{
			
			records.add(customer);
		}
	
	

	public int getNumberOfCustomer() 
		{
		return records.size();
		
		}

}
