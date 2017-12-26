package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Aview1 {
	private String name;
	private String age;
	private String gender;
	private Integer id;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
		public ArrayList<Aview1> userArray4 = new ArrayList<Aview1>();
		public String execute() throws ClassNotFoundException, SQLException
		{
		
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");

			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			java.sql.PreparedStatement ps=con.prepareStatement("select id,name,age,gender from user");
			ResultSet rs=(ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				Aview1 ra=new Aview1(); 
				ra.setId(rs.getInt(1));
				ra.setName(rs.getString(2));
				ra.setAge(rs.getString(3));
				ra.setGender(rs.getString(4));
				userArray4.add(ra);
				
			}
			
			
			return "success";
				
			}
		
	
			}
