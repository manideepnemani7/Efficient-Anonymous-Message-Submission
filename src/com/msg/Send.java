package com.msg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

//import java.awt.List;
//import java.util.ArrayList;



	
	public class Send {
		//private static final long serialVersionUID = 2124421844550008773L;

		//private ArrayList<Object> colors = new ArrayList<Object>();
		//private List cpus;
	private Integer id;

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

		public String getHair() {
			return hair;
		}

		public void setHair(String hair) {
			this.hair = hair;
		}

		public String getEye() {
			return eye;
		}

		public void setEye(String eye) {
			this.eye = eye;
		}

		public String getEthnicity() {
			return ethnicity;
		}

		public void setEthnicity(String ethnicity) {
			this.ethnicity = ethnicity;
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

		private String name;
		private String height;
		private String weight;
		private String mole;
		private String blood;
		private String hair;
		private String eye;
		private String ethnicity;
		private String martial;
		private String occupation;
		private String diseases;
		private String smoke;
		private String allergies;
		private String name1;
		private String height1;
		private String weight1;
		private String mole1;
		private String blood1;
		private String hair1;
		private String eye1;
		private String ethnicity1;
		private String martial1;
		private String occupation1;
		private String diseases1;
		private String smoke1;
		private String allergies1;
		private String name2;
		private String height2;
		private String weight2;
		private String mole2;
		private String blood2;
		private String hair2;
		private String eye2;
		private String ethnicity2;
		private String martial2;
		private String occupation2;
		private String diseases2;
		private String smoke2;
		private String allergies2;
		
		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getHeight1() {
			return height1;
		}

		public void setHeight1(String height1) {
			this.height1 = height1;
		}

		public String getWeight1() {
			return weight1;
		}

		public void setWeight1(String weight1) {
			this.weight1 = weight1;
		}

		public String getMole1() {
			return mole1;
		}

		public void setMole1(String mole1) {
			this.mole1 = mole1;
		}

		public String getBlood1() {
			return blood1;
		}

		public void setBlood1(String blood1) {
			this.blood1 = blood1;
		}

		public String getHair1() {
			return hair1;
		}

		public void setHair1(String hair1) {
			this.hair1 = hair1;
		}

		public String getEye1() {
			return eye1;
		}

		public void setEye1(String eye1) {
			this.eye1 = eye1;
		}

		public String getEthnicity1() {
			return ethnicity1;
		}

		public void setEthnicity1(String ethnicity1) {
			this.ethnicity1 = ethnicity1;
		}

		public String getMartial1() {
			return martial1;
		}

		public void setMartial1(String martial1) {
			this.martial1 = martial1;
		}

		public String getOccupation1() {
			return occupation1;
		}

		public void setOccupation1(String occupation1) {
			this.occupation1 = occupation1;
		}

		public String getDiseases1() {
			return diseases1;
		}

		public void setDiseases1(String diseases1) {
			this.diseases1 = diseases1;
		}

		public String getSmoke1() {
			return smoke1;
		}

		public void setSmoke1(String smoke1) {
			this.smoke1 = smoke1;
		}

		public String getAllergies1() {
			return allergies1;
		}

		public void setAllergies1(String allergies1) {
			this.allergies1 = allergies1;
		}

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}

		public String getHeight2() {
			return height2;
		}

		public void setHeight2(String height2) {
			this.height2 = height2;
		}

		public String getWeight2() {
			return weight2;
		}

		public void setWeight2(String weight2) {
			this.weight2 = weight2;
		}

		public String getMole2() {
			return mole2;
		}

		public void setMole2(String mole2) {
			this.mole2 = mole2;
		}

		public String getBlood2() {
			return blood2;
		}

		public void setBlood2(String blood2) {
			this.blood2 = blood2;
		}

		public String getHair2() {
			return hair2;
		}

		public void setHair2(String hair2) {
			this.hair2 = hair2;
		}

		public String getEye2() {
			return eye2;
		}

		public void setEye2(String eye2) {
			this.eye2 = eye2;
		}

		public String getEthnicity2() {
			return ethnicity2;
		}

		public void setEthnicity2(String ethnicity2) {
			this.ethnicity2 = ethnicity2;
		}

		public String getMartial2() {
			return martial2;
		}

		public void setMartial2(String martial2) {
			this.martial2 = martial2;
		}

		public String getOccupation2() {
			return occupation2;
		}

		public void setOccupation2(String occupation2) {
			this.occupation2 = occupation2;
		}

		public String getDiseases2() {
			return diseases2;
		}

		public void setDiseases2(String diseases2) {
			this.diseases2 = diseases2;
		}

		public String getSmoke2() {
			return smoke2;
		}

		public void setSmoke2(String smoke2) {
			this.smoke2 = smoke2;
		}

		public String getAllergies2() {
			return allergies2;
		}

		public void setAllergies2(String allergies2) {
			this.allergies2 = allergies2;
		}

private Integer s1;
private Integer s2;
private Integer s3;



		public Integer getS1() {
	return s1;
}

public void setS1(Integer s1) {
	this.s1 = s1;
}

public Integer getS2() {
	return s2;
}

public void setS2(Integer s2) {
	this.s2 = s2;
}

public Integer getS3() {
	return s3;
}

public void setS3(Integer s3) {
	this.s3 = s3;
}
private Integer s4;

		public Integer getS4() {
	return s4;
}

public void setS4(Integer s4) {
	this.s4 = s4;
}

public ArrayList<Send> getUserArray() {
	ArrayList<Send> userArray2 = null;
	return userArray2;
}


public static long getSerialversionuid() {
	return getSerialversionuid();
}
public ArrayList<Send> userArray2 = new ArrayList<Send>();
public String execute() throws ClassNotFoundException, SQLException
{
	
	
	Connection con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps1=con1.prepareStatement("select AES_DECRYPT(name,'key'),AES_DECRYPT(height,'key'),AES_DECRYPT(weight,'key'),AES_DECRYPT(eye,'key'),AES_DECRYPT(hair,'key'),AES_DECRYPT(mole,'key'),AES_DECRYPT(blood,'key'),AES_DECRYPT(martial,'key'),AES_DECRYPT(occupation,'key'),AES_DECRYPT(ethnicity,'key'),AES_DECRYPT(diseases,'key'),AES_DECRYPT(smoke,'key'),AES_DECRYPT(allergies,'key'),id from data where id='"+id+"' ");
	ResultSet rs1=(ResultSet) ps1.executeQuery();
	while(rs1.next())
	{
		//Cview ra1=new Cview(); 
		//ra1.setName1(rs1.getString(1));
		//userArray1.add(ra1);
		name=rs1.getString(1);
		height=rs1.getString(2);
		weight=rs1.getString(3);
		eye=rs1.getString(4);
		hair=rs1.getString(5);
		mole=rs1.getString(6);
		blood=rs1.getString(7);
		martial=rs1.getString(8);
		occupation=rs1.getString(9);
		ethnicity=rs1.getString(10);
		 diseases=rs1.getString(11);
		 smoke=rs1.getString(12);
		 allergies=rs1.getString(13);
		 s1=rs1.getInt(14);
	}
	Connection con2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps2=con2.prepareStatement("select AES_DECRYPT(name,'key'),AES_DECRYPT(height,'key'),AES_DECRYPT(weight,'key'),AES_DECRYPT(eye,'key'),AES_DECRYPT(hair,'key'),AES_DECRYPT(mole,'key'),AES_DECRYPT(blood,'key'),AES_DECRYPT(martial,'key'),AES_DECRYPT(occupation,'key'),AES_DECRYPT(ethnicity,'key'),AES_DECRYPT(diseases,'key'),AES_DECRYPT(smoke,'key'),AES_DECRYPT(allergies,'key'),id from data1 where id='"+id+"' ");
	ResultSet rs2=(ResultSet) ps2.executeQuery();
	while(rs2.next())
	{
		
		name1=rs2.getString(1);
		height1=rs2.getString(2);
		weight1=rs2.getString(3);
		 eye1=rs2.getString(4);
		 hair1=rs2.getString(5);
		 mole1=rs2.getString(6);
		 blood1=rs2.getString(7);
		 martial1=rs2.getString(8);
		 occupation1=rs2.getString(9);
		 ethnicity1=rs2.getString(10);
		 diseases1=rs2.getString(11);
		 smoke1=rs2.getString(12);
		 allergies1=rs2.getString(13);
		 s2=rs2.getInt(14);
	}
	
	Connection con3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps3=con3.prepareStatement("select AES_DECRYPT(name,'key'),AES_DECRYPT(height,'key'),AES_DECRYPT(weight,'key'),AES_DECRYPT(eye,'key'),AES_DECRYPT(hair,'key'),AES_DECRYPT(mole,'key'),AES_DECRYPT(blood,'key'),AES_DECRYPT(martial,'key'),AES_DECRYPT(occupation,'key'),AES_DECRYPT(ethnicity,'key'),AES_DECRYPT(diseases,'key'),AES_DECRYPT(smoke,'key'),AES_DECRYPT(allergies,'key'),id from data2 where id='"+id+"' ");
	ResultSet rs3=(ResultSet) ps3.executeQuery();
	while(rs3.next())
	{
		//Cview ra11=new Cview(); 
		//ra11.setName2(rs11.getString(1));
		//userArray1.add(ra11);
		name2=rs3.getString(1);
		height2=rs3.getString(2);
		weight2=rs3.getString(3);
		eye2=rs3.getString(4);
		hair2=rs3.getString(5);
		 mole2=rs3.getString(6);
		 blood2=rs3.getString(7);
		 martial2=rs3.getString(8);
		 occupation2=rs3.getString(9);
		 ethnicity2=rs3.getString(10);
		 diseases2=rs3.getString(11);
		 smoke2=rs3.getString(12);
		 allergies2=rs3.getString(13);
		 s3=rs3.getInt(14);
	}
String a=name+name1+name2;
String b=height+height1+height2;
String c=weight+weight1+weight2;
String d=eye+eye1+eye2;
String e=hair+hair1+hair2;
String f=mole+mole1+mole2;
String g=blood+blood1+blood2;
String h=martial+martial1+martial2;
String i=occupation+occupation1+occupation2;
String j=ethnicity+ethnicity1+ethnicity2;
String  k=diseases+diseases1+diseases2;
String l= smoke+smoke1+smoke2;
String m= allergies+allergies1+allergies2;
 //String x="view";
Send ra11=new Send(); 
ra11.setId(id);
ra11.setName(a);
ra11.setHeight(b);
ra11.setWeight(c);
ra11.setEye(d);
ra11.setHair(e);
ra11.setMole(f);
ra11.setBlood(g);
ra11.setMartial(h);
ra11.setOccupation(i);
ra11.setEthnicity(j);
ra11.setDiseases(k);
ra11.setSmoke(l);
ra11.setAllergies(m);
ra11.setId(s1);
  userArray2.add(ra11);
  Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps=con.prepareStatement("insert into root1(id,name,height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies) values('"+s1+"',AES_ENCRYPT('"+a+"','key'),AES_ENCRYPT('"+b+"','key'),AES_ENCRYPT('"+c+"','key'),AES_ENCRYPT('"+d+"','key'),AES_ENCRYPT('"+e+"','key'),AES_ENCRYPT('"+f+"','key'),AES_ENCRYPT('"+g+"','key'),AES_ENCRYPT('"+h+"','key'),AES_ENCRYPT('"+i+"','key'),AES_ENCRYPT('"+j+"','key'),AES_ENCRYPT('"+k+"','key'),AES_ENCRYPT('"+l+"','key'),AES_ENCRYPT('"+m+"','key'))");
	ps.executeUpdate();
	  
	
	Connection con4 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps4=con4.prepareStatement("delete from data where id='"+id+"'");
	ps4.executeUpdate();
	Connection con5 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps5=con5.prepareStatement("delete from data1 where id='"+id+"'");
	ps5.executeUpdate();
	Connection con6 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
	java.sql.PreparedStatement ps6=con6.prepareStatement("delete from data2 where id='"+id+"'");
	ps6.executeUpdate();
		return "success";
	
	}
	
}
