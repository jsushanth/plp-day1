package com.cg.oicr.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {
	private static Connection connection=null;

	public static Connection getConnection() throws IOException {
		
		Properties p=new Properties();
		
		
		FileInputStream fIS=new FileInputStream("resorces/db.properties");
			
			p.load(fIS);
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			
	
	try
	{
		Class.forName(driver);
		connection=DriverManager.getConnection(url,username,password);
		
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(SQLException s)
	{
		s.printStackTrace();
	}
	
	return connection;
	}
	
}
