package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Admin1 {
	public ArrayList<Admin1> userArray = new ArrayList<Admin1>();
	private Integer id;

public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

private String name;
 private String password;
	
	public ArrayList<Admin1> getUserArray() {
	return userArray;
}

public void setUserArray(ArrayList<Admin1> userArray) {
	this.userArray = userArray;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public String execute()
	{
		
		try
		{
		
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			java.sql.PreparedStatement ps=con.prepareStatement("select name,password from admin where name='"+name+"' AND password='"+password+"'");
			ResultSet rs=(ResultSet) ps.executeQuery();
			if(rs.next())
			{
				
	    	   	 name=rs.getString(1);
	    	   	  password=rs.getString(2);
	    	   
	            //return "success"; 
	            
			}
			else
			{
				return "error";
			}
			
		}
		

			catch (Exception e){  
				e.printStackTrace();
				System.out.println(e);
			}
		 return "success"; 
			}





}


