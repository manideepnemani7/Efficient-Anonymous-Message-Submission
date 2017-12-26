package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import com.opensymphony.xwork2.ActionSupport;

public class View extends ActionSupport{
	/**
	 * 
	 */
	private String text;
	private String text1;
	private String text2;
	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<View> getUserArray() {
		return userArray;
	}

	public void setUserArray(ArrayList<View> userArray) {
		this.userArray = userArray;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	public ArrayList<View> userArray = new ArrayList<View>();
	
	public String execute()
	{
		
		try
		{
		
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			System.out.println("connect");
			java.sql.PreparedStatement ps=con.prepareStatement("select CONCAT(AES_DECRYPT(data.s1,'key'),AES_DECRYPT(data1.s1,'key'),AES_DECRYPT(data2.s1,'key')) from data,data1,data2 where data.id='"+text+"'=data1.id='"+text+"'=data2.id='"+text+"'");
			ResultSet rs=(ResultSet) ps.executeQuery();
			while(rs.next())
			{
				View ra=new View(); 
	    	   	ra.setText(rs.getString(1));
	    		//ra.setText1(rs.getString(2));
	    		//ra.setText2(rs.getString(3));
		
	            userArray.add(ra);
	          
	           
			}
		}
		

			catch (Exception e){  
				e.printStackTrace();
				System.out.println(e);
			}
		return "success";
			}
	



}


