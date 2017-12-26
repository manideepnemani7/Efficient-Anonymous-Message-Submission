package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import com.msg.User;
import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionContext;

public class User {
	public ArrayList<User> userArray = new ArrayList<User>();
	private Integer id;

public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

private String name;
 private String password;
	
	public ArrayList<User> getUserArray() {
	return userArray;
}

public void setUserArray(ArrayList<User> userArray) {
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
		Map<String, Object> session = ActionContext.getContext().getSession();
		//session.clear();
		
		try
		{
		
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			java.sql.PreparedStatement ps=con.prepareStatement("select name,password,id from user where name='"+name+"' AND password='"+password+"'");
			ResultSet rs=(ResultSet) ps.executeQuery();
			if(rs.next())
			{
				User ra=new User(); 
	    	   	 name=rs.getString(1);
	    	   	  password=rs.getString(2);
	    	   	id=rs.getInt(3);
	            userArray.add(ra);
	            //return "success"; 
	            session.put("name",name);

	        session.put("userid",id);

	            
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


