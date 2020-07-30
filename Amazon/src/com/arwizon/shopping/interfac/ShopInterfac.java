package com.arwizon.shopping.interfac;

import com.arwizon.shopping.model.Product;

public interface ShopInterfac {
	public Product addProduct(String name, String description, String manuf,String imgurl,String units, String category);
	public Product[] searchProduct(String name,Product[] arr);

}