package com.shopping;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbcon {

	
	
	public Connection getDBConeection() {

		Connection con=null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/watch","root","");

		}catch(Exception ex)

		{

			System.out.println(ex);

		}

		return con;

	}

}