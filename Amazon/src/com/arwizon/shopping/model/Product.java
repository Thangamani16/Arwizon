package com.arwizon.shopping.model;

//import java.util.List;

public class Product implements Comparable<Product> {
	
	private String name;
	private String description;
	private String imgurl;
	private String units;
	private String category;
	private String manuf;
	private static int productid;
	static
	{
		productid = 99;
	}
	public Product()
	{
		productid++;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getManuf() {
		return manuf;
	}
	public void setManuf(String manuf) {
		this.manuf = manuf;
	}
	public static int getProductid() {
		return productid;
	}
	public static void setProductid(int productid) {
		Product.productid = productid;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", imgurl=" + imgurl + ", units=" + units
				+ ", category=" + category + ", manuf=" + manuf + "]";
	}
	@Override
	public int compareTo(Product o) {
		if(this.getName().compareTo(o.getName())>0)
			return 1;
		else if(this.getName().compareTo(o.getName())<0)
				return -1;
		else
			return 0;
	}
	}