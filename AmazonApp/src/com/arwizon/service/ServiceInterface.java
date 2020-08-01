package com.arwizon.service;

import java.util.Set;

import com.arwizon.model.ProductDetails;

public interface ServiceInterface {
	public void addProduct(String name, String description, String manufacturerName, int price, int discount,
			String imgUrl, int noOfUnits, String category);
	public Set<ProductDetails> displayProduct();
	public Set <ProductDetails> searchProduct(String name);
	public void deleteProduct(int productId);
	public void updateProduct(int productId, int noOfUnits);
}
