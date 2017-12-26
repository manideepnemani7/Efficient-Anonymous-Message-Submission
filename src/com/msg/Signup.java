package com.msg;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionSupport;

public class Signup extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String password;
	private String age;
	private String gender;
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String execute()
	{
		try
		{
		Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			java.sql.PreparedStatement ps=con.prepareStatement("insert into user values('"+id+"','"+name+"','"+password+"','"+age+"','"+gender+"')");
			ps.executeUpdate();
			
			}
		catch (Exception e)
		{  
			e.printStackTrace();
			}
		return "success";
	
	}
	
}
