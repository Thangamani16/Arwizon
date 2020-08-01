package com.arwizon.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.arwizon.model.ProductDetails;

public class ServiceInterfaceImp implements ServiceInterface {
	Connection con = ConnectionClass.Connectiondb();
	@Override
	public void addProduct(String name, String description, String manufacturerName, int price, int discount,
			String imgUrl, int noOfUnits, String category) {

		
		try {


			String sq = "select max(ProductId) from Amazenlist";
			PreparedStatement stmt1 = con.prepareStatement(sq);
			ResultSet rs = stmt1.executeQuery();
			int i = 533;
		while(rs.next()) {
		
			String sql = "insert into Amazenlist values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			ProductDetails p=new ProductDetails();
			stmt.setInt(1, i+1);
			stmt.setString(2, name);
			stmt.setString(3, description);
			stmt.setString(4, manufacturerName);
			stmt.setInt(5, price);
			stmt.setInt(6, discount);
			stmt.setString(7, imgUrl);
			stmt.setInt(8, noOfUnits);
			stmt.setString(9, category);
			stmt.executeUpdate();
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Set<ProductDetails> displayProduct(){
		//int productId=0;
		Set<ProductDetails> m1 = new HashSet<ProductDetails>();
		Connection con = ConnectionClass.Connectiondb();
		try {

			String sql = "select * from Amazenlist";
			PreparedStatement stmt = con.prepareStatement(sql);
		   
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				ProductDetails pd1=new ProductDetails();
				pd1.setProductId(rs.getInt(1));
				pd1.setName(rs.getString(2));
				pd1.setDescription(rs.getString(3));
				pd1.setManufacturerName(rs.getString(4));
				pd1.setPrice(rs.getInt(5));
				pd1.setDiscount(rs.getInt(6));
				pd1.setImgUrl(rs.getString(7));
				pd1.setNoOfUnits(rs.getInt(8));
				pd1.setCategory(rs.getString(9));
				m1.add(pd1);	             
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return m1;
		
	}


	public Set <ProductDetails> searchProduct(String name) {

		Set<ProductDetails> m2 = new HashSet<ProductDetails>();
		Connection con = ConnectionClass.Connectiondb();
		try {

			String sql = "select * from ProductList where name=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				ProductDetails pd1=new ProductDetails();
				pd1.setProductId(rs.getInt(1));
				pd1.setName(rs.getString(2));
				pd1.setDescription(rs.getString(3));
				pd1.setManufacturerName(rs.getString(4));
				pd1.setPrice(rs.getInt(5));
				pd1.setDiscount(rs.getInt(6));
				pd1.setImgUrl(rs.getString(7));
				pd1.setNoOfUnits(rs.getInt(8));
				pd1.setCategory(rs.getString(9));
				m2.add( pd1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m2;

	}
		/*	Set<Integer> s = li.keySet();
		for (Integer p : s) {
			if (p == productId) {
				l1.put(p, li.get(p));
			}
		}
*/
			

	@Override
	public void deleteProduct(int productId) {

		String sql="delete from ProductList where productId=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, productId);
			stmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void updateProduct(int productId, int noOfUnits) {
		
		String sql="update ProductList set noOfUnits=? where productId=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(2, productId);
			stmt.setInt(1,noOfUnits );
			stmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}


			

		}
	}
	

