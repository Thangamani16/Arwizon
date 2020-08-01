package com.arwizon.banking.interfa;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.arwizon.banking.db.ConnectionDB;
import com.arwizon.banking.model.CustomerDetails;

public class InterfacImpl implements CustomerInterface {

	@Override
	public void createCustomer(String name,String address,String accountType) {	
		Connection con = ConnectionDB.connectDb();
		String Sql= "insert into Customers values(?,?,?,?)";
		try {
			PreparedStatement smt = con.prepareStatement(Sql);
			CustomerDetails c3 = new CustomerDetails();
			smt.setInt(1, CustomerDetails.getCount());
			smt.setString(2, name);
			smt.setString(3, address);
			smt.setString(4, accountType);
			smt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*CustomerDetails p = new CustomerDetails();
		p.setName(name);
		p.setAddress(address);
		p.setAccountType(accountType);
		p.setAccount_Number(CustomerDetails.getCount());*/
	}

	@Override
	public Set<CustomerDetails> updateName(String name, Set<CustomerDetails> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<CustomerDetails> delete(int account_Number, Set<CustomerDetails> p) {
		// TODO Auto-generated method stub
		return null;
	}
	
}