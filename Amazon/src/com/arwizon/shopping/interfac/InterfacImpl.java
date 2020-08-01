package com.arwizon.shopping.interfac;

//import java.util.List;
import java.util.Set;

import com.arwizon.shopping.model.Product;

public interface InterfacImpl {
	public Product addProduct(String name, String description, String manuf,String imgurl,String units, String category);
	//public List<Product> searchProduct(String name,List<Product> arr);
	public Set<Product> searchProduct(String name1, Set<Product> arr);
	public Set<Product> deleteProduct(int units, Set<Product> arr);
	public Set<Product> update(int productid,int units, Set<Product> arr);

}