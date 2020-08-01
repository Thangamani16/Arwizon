package com.arwizon.banking.main;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.arwizon.banking.interfa.CustomerInterface;
import com.arwizon.banking.interfa.InterfacImpl;
import com.arwizon.banking.model.CustomerDetails;
import com.arwizon.banking.exceptions.Myexceptions;
import com.arwizon.banking.Utility.Utility;
import com.arwizon.banking.db.ConnectionDB;
public class Bank{
	public static void main(String[] args) throws Myexceptions{
		System.out.println("Press 1 to add new customer" +"\nPress 2 to display customer details"+"\nPress 3 to Search customer details"+"\nPress 4 to update for customer details"+"\nPress 5 to delete \nPress 6 to Exit");
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter array size");
		int size = s.nextInt();
		CustomerDetails[] c = new CustomerDetails[size];*/
		Map<Integer,CustomerDetails> m = new HashMap<Integer,CustomerDetails>();
		while(true) {
			System.out.println("Enter your Choice");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter Customer Name");
					name = s.next();
					try {
						Utility.namematch(name);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				
				String address = null;
				while (true) {
					System.out.println("Enter Customer Address");
					address = s.next();
					try {
						Utility.namematch(address);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}

				String accountType = null;
				while (true) {
					System.out.println("Enter Customer Account Type");
					accountType = s.next();
					try {
						Utility.namematch(accountType);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				CustomerInterface  cust = new InterfacImpl();
				cust.createCustomer(name,address,accountType);
				//m.put(c1.getAccount_Number(), c1);
						break;
			case 2:
				Set<Integer> d = m.keySet();
				System.out.println(d);
				for(Integer i:d)
				{
					System.out.println(m.get(i));
				}
				break;

			case 3:
				/*Set<Integer> k = m.keySet();
				System.out.println(k);
				System.out.println("Enter the Account Number to be searched");
				int h = s.nextInt();
				//updateName(h,)
				for(Integer l:k)
				{
					if(h==l)
					{
						System.out.println("Customer Account Found");
						System.out.println(m.get(h));
						break;
					}
				}*/
				break;
			/*case 3:
				if(c[0]!=null) {
					System.out.println("Please Enter Customer Name");
					String name1=s.next();
					boolean flag=false;
					for(int i=0;i<c.length;i++) {
						if(name1.equals(c[i].getName()))
						{
							System.out.println(c[i]);
							flag=true;
						}
					}
					if(flag==false) {
						System.out.println("Customer Not Found");
					}

				}
				break;*/
			/*case 4:
				Set<Integer> w = m.keySet();
				System.out.println(w);
				System.out.println("Enter the Account Number That has to be updated");
				int b = s.nextInt();
				for(Integer l:w)
				{
					if(b==l)
					{
						System.out.println("Press 1 to Update Name\nPress 2 to Update Address\n Press 3 to Update Account Type");
						int up = s.nextInt();
						switch(up)
						{
						case 1 :
							System.out.println("Enter Name to be Updated");
							String uName = s.next();
							m.
							System.out.println(m.get(b));
						}
						//m.replace(l, c1);
						System.out.println("");
						break;
					}
				}
				
				break;*/
			case 5:
				Set<Integer> g = m.keySet();
				System.out.println(g);
				System.out.println("Enter the Account Number That has to be deleted");
				int q = s.nextInt();
				for(Integer l:g)
				{
					if(q==l)
					{
						System.out.println("Customer Account deleted");
						m.remove(l);
						break;
					}
				}
				break;
			case 6:System.exit(1);
			break;

			default:
				System.out.println("Wrong Choice");
			}
		}

	}

}
