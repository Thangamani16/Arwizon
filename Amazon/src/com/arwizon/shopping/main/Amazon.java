package com.arwizon.shopping.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//import java.util.TreeSet;

import com.arwizon.shopping.exceptions.Myexceptions;
import com.arwizon.shopping.interfac.InterfaceImpl;
import com.arwizon.shopping.interfac.InterfacImpl;
import com.arwizon.shopping.model.Product;
import com.arwizon.shopping.utilities.Utility;

public class Amazon {
	public static void main(String[] args) {
		String str = null;
		System.out.println("Press 1 to add new product \nPress 2 to search product details \nPress 3 to display \nPress 4 to delete press 5 to exit");
		Scanner s = new Scanner(System.in);
		Set<Product> arr = new HashSet<Product>();
		while (true) {
			System.out.println("Choose your option");
			int option = s.nextInt();
			switch (option) {

			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter product name");
					name = s.next();
					try {
						Utility.namematch(name);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				String description = null;
				while (true) {
					System.out.println("Enter product description");
					description = s.next();
					try {
						Utility.namematch(description);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				String manuf = null;
				while (true) {
					System.out.println("Enter Manufacturer name");
					manuf = s.next();
					try {
						Utility.namematch(manuf);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				String category = null;
				while (true) {
					System.out.println("Enter category");
					category = s.next();
					try {
						Utility.namematch(category);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				String units = null;
				while (true) {
					System.out.println("Enter Number of Units");
					units = s.next();
					try {
						Utility.unitsmatch(units);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}
				String imgurl = null;
				while (true) {
					System.out.println("Enter Imageurl");
					imgurl = s.next();
					try {
						Utility.urlmatch(imgurl);
						break;
					} catch (Myexceptions e) {
						System.out.println(e.getMessage());
					}

				}

				InterfacImpl si = new InterfaceImpl();
				Product p1 = si.addProduct(name, description, manuf, imgurl, units, category);
				arr.add(p1);
				break;
			case 2:
				System.out.println("Enter product name to search");
				String name1 = s.next();
				InterfacImpl s2 = new InterfaceImpl();
				Set<Product> hi = s2.searchProduct(name1,arr);
				if(hi.size()==0)
					System.out.println("Product Not Found");
				else
				{
					for(Product o: hi)
					{
						System.out.println(o);
					}
				}
				/*ShopInterfac prod = new Interfacimp();
				Product[] p2 = prod.searchProduct(name1,arr);
				if (p2[0] == null) {
					System.out.println("Product not found");
				} else {
					for (Product t : p2) {
						if (t == null) {
							break;
						} else {
							System.out.println(t);
						}
					}
				}*/
				break;
			case 3:
				for(Product l: arr)
					System.out.println(l);
				
				break;
				
			case 4:
				System.out.println("Enter Product id");
				int id = s.nextInt();
				InterfacImpl s3 = new InterfaceImpl();
				Set<Product> arr1 = s3. deleteProduct(id,arr) ;
					for(Product j:arr1)
					{
						System.out.println(j);
					}
					break;
			case 5: System.out.println("Enter Product id");
			int id = s.nextInt();
			System.out.println("Enter unit count");
			int count = s.nextInt();
			InterfacImpl s4 = new InterfaceImpl();
			Set<Product> arr = s4. deleteProduct(id,arr) ;
			
				
				break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Please enter the valid option");
			}
		}
	}

}