package com.arwizon.banking.interfa;

import com.arwizon.banking.model.CustomerDetails;

public class InterfacImpl implements CustomerInterface {

	@Override
	public CustomerDetails createCustomer(String name,String address,String accountType) {		
		CustomerDetails p = new CustomerDetails();
		p.setName(name);
		p.setAddress(address);
		p.setAccountType(accountType);
		CustomerDetails.setAccount_Number(CustomerDetails.getAccount_Number());
		return p;
	}
}