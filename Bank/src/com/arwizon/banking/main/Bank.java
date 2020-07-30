package com.arwizon.banking.main;
import java.util.Scanner;
import com.arwizon.banking.interfa.CustomerInterface;
import com.arwizon.banking.interfa.InterfacImpl;
import com.arwizon.banking.model.CustomerDetails;
public class Bank{
	public static void main(String[] args) {
		System.out.println("Press 1 to add new customer" +"\nPress 2 to display customer details"+"\nPress 3 to update customer details"+"\nPress 4 to search for customer details"+"\nPress 5 to exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		CustomerDetails[] c = new CustomerDetails[size];
		while(true) {
			System.out.println("Enter your Choice");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter name");
				String name = s.next();
				System.out.println("Enter address");
				String  address = s.next();
				System.out.println("Enter Account type");
				String  accountType = s.next();
				CustomerInterface  cust = new InterfacImpl();
				CustomerDetails c1 = cust.createCustomer(name,address,accountType);
				for(int i=0;i<c.length;i++) {
					if(c[i]==null) {
						c[i]=c1;
						break;
					}
				}
				break;
			case 2:
				for(CustomerDetails t:c)
				{
					if(t==null)
					{
						break;
					}
					System.out.println(t);
				}
				break;
			case 3:
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
				break;


			case 4:System.exit(1);
			break;

			default:
				System.out.println("Wrong Choice");
			}
		}

	}

}
