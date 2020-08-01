package com.arwizon.main;

import java.util.*;

import com.arwizon.exception.UserException;
import com.arwizon.model.ProductDetails;
import com.arwizon.service.ConnectionClass;
import com.arwizon.service.ServiceInterface;
import com.arwizon.service.ServiceInterfaceImp;
import com.arwizon.service.Utilities;

public class AmazonApp {

	public static void main(String[] args) throws UserException {

		ConnectionClass.Connectiondb();
		System.out.println("Press 1 to add New Product \nPress 2 to Display Product Details \nPress 3 to search \nPress 4 to Update \nPress 5 to Delete \nPress 6 to Exit");
		Scanner s = new Scanner(System.in);
		Set<ProductDetails> m = new HashSet<ProductDetails>();
		while (true) {
			System.out.println("Enter your Choice for operations");
			int Choice = s.nextInt();
			switch (Choice) {

			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter Product Name");
					name = s.next();
					try {
						Utilities.nameMatch(name);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}

				}
				String description = null;
				while (true) {
					System.out.println("Enter product description");
					description = s.next();
					try {
						Utilities.nameMatch(description);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}

				}

				String price1 = null;
				while (true) {
					System.out.println("Enter price");
					price1 = s.next();
					try {
						Utilities.priceMatch(price1);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}
				}
				int price = Integer.parseInt(price1);

				String manufacturerName = null;
				while (true) {
					System.out.println("Enter Manufacturer name");
					manufacturerName = s.next();
					try {
						Utilities.nameMatch(manufacturerName);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}

				}

				String discount1 = null;
				while (true) {
					System.out.println("Enter discount offered");
					discount1 = s.next();
					try {
						Utilities.discountMatch(discount1);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}

				}
				int discount = Integer.parseInt(discount1);

				String imgUrl = null;
				while (true) {
					System.out.println("Enter Imageurl");
					imgUrl = s.next();
					try {
						Utilities.urlMatch(imgUrl);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}
				}

				String units = null;
				while (true) {
					System.out.println("Enter no of units");
					units = s.next();
					try {
						Utilities.unitsMatch(units);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}

				}
				int noOfUnits = Integer.parseInt(units);

				String category = null;
				while (true) {
					System.out.println("Enter category");
					category = s.next();
					try {
						Utilities.nameMatch(category);
						break;
					} catch (UserException e) {
						System.out.println(e.getMessage());
					}
				}

				ServiceInterface si = new ServiceInterfaceImp();
				si.addProduct(name, description, manufacturerName, price, discount, imgUrl,
						noOfUnits, category);
				System.out.println("Product has been Added");
				break;
			case 2:
				ServiceInterface si1 = new ServiceInterfaceImp();
				Set<ProductDetails> m1=si1.displayProduct();
				for (ProductDetails p : m1) {
					System.out.println(p);
				}
				break;

			case 3:
				System.out.println("Enter product name to search");
				String pname = s.next();
				
				ServiceInterface prod = new ServiceInterfaceImp();

				Set<ProductDetails> product = prod.searchProduct(pname);
				if (product.size()==0) {
					System.out.println("Product not found");
				} else {
					for (ProductDetails p : product) {
						System.out.println(p);
					}
							
				}
				break;			
			case 4:
				System.out.println("Please Enter Product Id");
				String id = s.next();
				int productId2 = Integer.parseInt(id);
				ServiceInterface prod1 = new ServiceInterfaceImp();
				
				prod1.deleteProduct(productId2);
				System.out.println("Delete Success");
				
				break;

			case 5:
				ServiceInterface prod2 = new ServiceInterfaceImp();
				System.out.println("Enter the Product Id");
				String newName = s.next();
				int productId3 = Integer.parseInt(newName);
				System.out.println("Enter the number of units");
				String units1 = s.next();
				int updatedUnits= Integer.parseInt(units1);
				prod2.updateProduct(productId3, updatedUnits);
				System.out.println("Update Success");
				break;

			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Please enter the valid Choice");
			}
		}

	}
}

