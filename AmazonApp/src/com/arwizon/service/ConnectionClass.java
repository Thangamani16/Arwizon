package com.arwizon.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	public static Connection Connectiondb() {
		Connection con=null;;
		try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amazonapp","root","Thangam25@");
		  
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	return con;
	}

}