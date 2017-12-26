package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Aview {
	private String height;
	private String weight;
	private String eye;
	private String hair;
	private String mole;
	private String blood;
	private String martial;
	 private String occupation;
	private String ethnicity;
		private String diseases;
		private String smoke;
		private String allergies;
		private Integer id;
		private String name;
		public String getHeight() {
			return height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getEye() {
			return eye;
		}
		public void setEye(String eye) {
			this.eye = eye;
		}
		public String getHair() {
			return hair;
		}
		public void setHair(String hair) {
			this.hair = hair;
		}
		public String getMole() {
			return mole;
		}
		public void setMole(String mole) {
			this.mole = mole;
		}
		public String getBlood() {
			return blood;
		}
		public void setBlood(String blood) {
			this.blood = blood;
		}
		public String getMartial() {
			return martial;
		}
		public void setMartial(String martial) {
			this.martial = martial;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public String getEthnicity() {
			return ethnicity;
		}
		public void setEthnicity(String ethnicity) {
			this.ethnicity = ethnicity;
		}
		public String getDiseases() {
			return diseases;
		}
		public void setDiseases(String diseases) {
			this.diseases = diseases;
		}
		public String getSmoke() {
			return smoke;
		}
		public void setSmoke(String smoke) {
			this.smoke = smoke;
		}
		public String getAllergies() {
			return allergies;
		}
		public void setAllergies(String allergies) {
			this.allergies = allergies;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ArrayList<Aview> userArray3 = new ArrayList<Aview>();
		public String execute() throws ClassNotFoundException, SQLException
		{
		
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");

			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
			java.sql.PreparedStatement ps=con.prepareStatement("select id,AES_DECRYPT(name,'key'),AES_DECRYPT(height,'key'),AES_DECRYPT(weight,'key'),AES_DECRYPT(eye,'key'),AES_DECRYPT(hair,'key'),AES_DECRYPT(mole,'key'),AES_DECRYPT(blood,'key'),AES_DECRYPT(martial,'key'),AES_DECRYPT(occupation,'key'),AES_DECRYPT(ethnicity,'key'),AES_DECRYPT(diseases,'key'),AES_DECRYPT(smoke,'key'),AES_DECRYPT(allergies,'key') from root1");
			ResultSet rs=(ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				Aview ra=new Aview(); 
				ra.setId(rs.getInt(1));
				ra.setName(rs.getString(2));
				ra.setHeight(rs.getString(3));
				ra.setWeight(rs.getString(4));
				ra.setEye(rs.getString(5));
				ra.setHair(rs.getString(6));
				ra.setMole(rs.getString(7));
				ra.setBlood(rs.getString(8));
				ra.setMartial(rs.getString(9));
				ra.setOccupation(rs.getString(10));
				ra.setEthnicity(rs.getString(11));
				ra.setDiseases(rs.getString(12));
				ra.setSmoke(rs.getString(13));
				ra.setAllergies(rs.getString(14));
				userArray3.add(ra);
				
			}
			
			
			return "success";
				
			}
		
	
			}
