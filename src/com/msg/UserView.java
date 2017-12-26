package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionContext;

public class UserView {
	
	private String height;
	private String weight;
	private String eye;
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
	private String hair;
	private String mole;
	private String blood;
	private String martial;
	 private String occupation;
	private String ethnicity;
		private String diseases;
		private String smoke;
		private String allergies;
	

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
		public ArrayList<UserView> getUserArray() {
			return userArray;
		}

		public void setUserArray(ArrayList<UserView> userArray) {
			this.userArray = userArray;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		private static final long serialVersionUID = 1L;
		public ArrayList<UserView> userArray = new ArrayList<UserView>();

		public String execute()
		{
			Map<String, Object> session = ActionContext.getContext().getSession();
			
			Integer id1=(Integer)session.get("userid");
			
			try
			{
			
				Connection con=null;
				Class.forName("com.mysql.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
				System.out.println("connect");
				java.sql.PreparedStatement ps=con.prepareStatement("select AES_DECRYPT(height,'key'),AES_DECRYPT(weight,'key'),AES_DECRYPT(eye,'key'),AES_DECRYPT(hair,'key'),AES_DECRYPT(mole,'key'),AES_DECRYPT(blood,'key'),AES_DECRYPT(martial,'key'),AES_DECRYPT(occupation,'key'),AES_DECRYPT(ethnicity,'key'),AES_DECRYPT(diseases,'key'),AES_DECRYPT(smoke,'key'),AES_DECRYPT(allergies,'key') from root1 where id='"+id1+"'");
				ResultSet rs=(ResultSet) ps.executeQuery();
				while(rs.next())
				{
					UserView ra=new UserView(); 
		    	   	ra.setHeight(rs.getString(1));
		    		ra.setWeight(rs.getString(2));
		    		ra.setEye(rs.getString(3));
	                ra.setHair(rs.getString(4));
	                ra.setMole(rs.getString(5));
	                ra.setBlood(rs.getString(6));
	                ra.setMartial(rs.getString(7));
	                ra.setOccupation(rs.getString(8));
	                ra.setEthnicity(rs.getString(9));
	                ra.setDiseases(rs.getString(10));
	                ra.setSmoke(rs.getString(11));
	                ra.setAllergies(rs.getString(12));
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


