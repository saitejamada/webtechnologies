package com.connection;

import java.sql.*;
public class ConnectionProvider {

	public static String url="jdbc:oracle:thin:@localhost:1521:oracle";
	public static String user="c##scott4";
	public static String pass="tiger";
	
	public static Connection getConnection()
	{
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,pass);
			return con;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}
