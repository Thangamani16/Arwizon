package com.arwizon.shopping.main;
import java.util.Scanner;

import com.arwizon.shopping.exceptions.Myexceptions;
import com.arwizon.shopping.interfac.Interfacimp;
import com.arwizon.shopping.interfac.ShopInterfac;
import com.arwizon.shopping.model.Product;
import com.arwizon.shopping.utilities.Utility;

public class Amazon {
	public static void main(String[] args) {
		String str=null;
		System.out.println("Press 1 to add new product press 2 to display product details press 3 to search press 4 to update press 5 to delete press 6 to exit");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		Product[] arr =new Product[size] ;
		while(true) {
			System.out.println("Choose your option");
			int option=s.nextInt();
		switch(option) {
			
			case 1:String name=null;
	 			while(true) {
	 				System.out.println("Enter product name");
	 				name=s.next();
	 				try{
	 					Utility.namematch(name);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}String description=null;
	 			while(true) {
	 				System.out.println("Enter product description");
	 				description=s.next();
	 				try{
	 					Utility.namematch(description);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}
	 			String manuf=null;
	 			while(true) {
	 				System.out.println("Enter Manufacturer name");
	 				manuf=s.next();
	 				try{
	 					Utility.namematch(manuf);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}	String category=null;
	 			while(true) {
	 				System.out.println("Enter category");
	 				category=s.next();
	 				try{
	 					Utility.namematch(category);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}
	 			String units=null;
	 			while(true) {
	 				System.out.println("Enter Number of Units");
	 				units=s.next();
	 				try{
	 					Utility.unitsmatch(units);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}
	 			String imgurl = null;
	 			while(true) {
	 				System.out.println("Enter Imageurl");
	 				imgurl=s.next();
	 				try{
	 					Utility.urlmatch(imgurl);
	 					break;
	 				}
	 				catch(Myexceptions e)
	 				{
	    	    		 System.out.println(e.getMessage());
	    	    	 }
	 	
	 			}
	 			
	 	
	 		
	 			ShopInterfac si = new Interfacimp();
	 			Product p1=si.addProduct(name, description, manuf,imgurl, units, category);
	 			for(int i=0;i<arr.length;i++) {
	 				if(arr[i]==null) {
	 					arr[i]=p1;
	 					break;
	 				}		
	 			}
			break;
     case 2:
 		   System.out.println("Enter product name to search");
           String name1=s.next();
           ShopInterfac prod = new Interfacimp();
           Product[] p2 = prod.searchProduct(name1,arr);
           if(p2[0]==null) {
        	   System.out.println("Product not found");
           }
           else {
        	   for(Product t:p2) {
        		   if(t==null) {
        			   break;
        		   }
        		   else
        		   {
        			   System.out.println(t);
        		   }  	
        	   }
           }
        break;
     case 3:  for(Product p:arr) 
         	{
    	 	if(p!=null){         				}
	     	System.out.println(p);
         	}
         break;
         
case 4: System.exit(1);
     break;
default: System.out.println("Please enter the valid option");
}
	}
	}
}