package com.arwizon.banking.interfa;

import com.arwizon.banking.model.CustomerDetails;

public interface CustomerInterface {
	
	public CustomerDetails createCustomer(String name,String address,String accountType);
	
}