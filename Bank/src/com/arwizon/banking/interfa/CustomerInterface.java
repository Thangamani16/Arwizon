package com.arwizon.banking.interfa;

import java.util.Set;

import com.arwizon.banking.model.CustomerDetails;

public interface CustomerInterface {
	
	public void createCustomer(String name,String address,String accountType);
	
	public Set<CustomerDetails> updateName(String name, Set<CustomerDetails> p);
	
	

	public Set<CustomerDetails> delete(int account_Number, Set<CustomerDetails> p);
}