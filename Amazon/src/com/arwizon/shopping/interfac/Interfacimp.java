package com.arwizon.shopping.interfac;

import com.arwizon.shopping.model.Product;

public class Interfacimp implements ShopInterfac{

	@Override
	public Product addProduct(String name, String description, String manuf, String imgurl, String units,
			String category) {
		Product p =  new Product();
		p.setName(name);
		p.setDescription(description);
		p.setManuf(manuf);
		p.setImgurl(imgurl);
		p.setUnits(units);
		p.setCategory(category);	
	    Product.setProductid(Product.getProductid());
		return p;
	}
	@Override
	public Product[] searchProduct(String name, Product[] arr) {
		Product[] arr1=new Product[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(name.equals(arr[i].getName())) {
				arr1[j]=arr[i];
				j++;
							
			}
		}
		return arr1;
	}
	

}
