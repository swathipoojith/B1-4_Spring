package com.tns.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{
	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//get connection
		Connection con=DriverManager.getConnection(url, username, password);
		//execute a query
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM b4.emp_store1");
		while(r.next())
		{
			int userid=r.getInt(1);
			String name=r.getString(2);
			double salary=r.getDouble(3);
			String type=r.getString(4);
			String deptname=r.getString(5);
			System.out.println("Employee ID IS: "+userid+" Name: "+name+" salary is "+salary+"Employee type: "
					+type+" Dept Name is: "+deptname);
		}
		
	}
}