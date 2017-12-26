package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionContext;

public class Profile {
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
public ArrayList<Profile> userArray2 = new ArrayList<Profile>();
public String execute() throws ClassNotFoundException, SQLException
{
	Map<String, Object> session = ActionContext.getContext().getSession();
	
	Integer id1=(Integer)session.get("userid");
	Connection con=null;
	Class.forName("com.mysql.jdbc.Driver");

	con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps=con.prepareStatement("select id,name,age,gender from user where id='"+id1+"'");
	ResultSet rs=(ResultSet) ps.executeQuery();
	
	while(rs.next())
	{
		Profile ra=new Profile(); 
		ra.setId(rs.getInt(1));
		ra.setName(rs.getString(2));
		ra.setAge(rs.getString(3));
		ra.setGender(rs.getString(4));
		userArray2.add(ra);
		
	}
	
	
	return "success";
		
	}


	}

