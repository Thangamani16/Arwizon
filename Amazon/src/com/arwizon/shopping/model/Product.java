package com.arwizon.shopping.model;

public class Product {
	
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
		return "Product [productid ="+ productid +"name=" + name + ", description=" + description + ", imgurl=" + imgurl + ", units=" + units
				+ ", category=" + category + ", manuf=" + manuf + "]";
	}
}