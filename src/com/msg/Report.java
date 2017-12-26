package com.msg;

//import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Map;


import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionContext;



public class Report {
	
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
			public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		
		//public ArrayList<Report> userArray6 = new ArrayList<Report>();
				public String execute() throws ClassNotFoundException, SQLException
				{
					Map<String, Object> session = ActionContext.getContext().getSession();
					String name1=(String)session.get("name");
					Integer id1=(Integer)session.get("userid");
					int z =height.length();

					int z1=z/2;
					int z2=z1+z1;   

					int start = 0;
					int end = z1;
					char buf[] = new char[end - start];
					height.getChars(start, end, buf, 0);
					String s1 = new String(buf);

					int start1 = z1;
					int end1 = z2;
					char buf1[] = new char[end1 - start1];
					height.getChars(start1, end1, buf1, 0);
					String s2 = new String(buf1);
					
					int start2 = z2;
					int end2 = z;
					char buf2[] = new char[end2 - start2];
					height.getChars(start2, end2, buf2, 0);
					String s3 = new String(buf2);
					
					int a =weight.length();

					int a1=a/2;
					int a2=a1+a1;   

					int astart = 0;
					int aend =a1;
					char abuf[] = new char[aend - astart];
					weight.getChars(astart, aend, abuf, 0);
					String as1 = new String(abuf);

					int astart1 = a1;
					int aend1 =a2;
					char abuf1[] = new char[aend1 - astart1];
					weight.getChars(astart1, aend1, abuf1, 0);
					String as2 = new String(abuf1);
					
					int astart2 = a2;
					int aend2 = a;
					char abuf2[] = new char[aend2 - astart2];
					weight.getChars(astart2, aend2, abuf2, 0);
					String as3 = new String(abuf2);
					
					
					int b =eye.length();

					int b1=b/2;
					int b2=b1+b1;   

					int bstart = 0;
					int bend =b1;
					char bbuf[] = new char[bend - bstart];
					eye.getChars(bstart ,bend, bbuf, 0);
					String bs1 = new String(bbuf);

					int bstart1 = b1;
					int bend1 =b2;
					char bbuf1[] = new char[bend1 - bstart1];
					eye.getChars(bstart1, bend1, bbuf1, 0);
					String bs2 = new String(bbuf1);
					
					int bstart2 = b2;
					int bend2 =b;
					char bbuf2[] = new char[bend2 -bstart2];
					eye.getChars(bstart2, bend2, bbuf2, 0);
					String bs3 = new String(bbuf2);
					
					

					int c =hair.length();

					int c1=c/2;
					int c2=c1+c1;   

					int cstart = 0;
					int cend =c1;
					char cbuf[] = new char[cend - cstart];
					hair.getChars(cstart ,cend, cbuf, 0);
					String cs1 = new String(cbuf);

					int cstart1 = c1;
					int cend1 =c2;
					char cbuf1[] = new char[cend1 - cstart1];
					hair.getChars(cstart1, cend1, cbuf1, 0);
					String cs2 = new String(cbuf1);
					
					int cstart2 = c2;
					int cend2 =c;
					char cbuf2[] = new char[cend2 -cstart2];
					hair.getChars(cstart2, cend2, cbuf2, 0);
					String cs3 = new String(cbuf2);
					
					

					int d =mole.length();

					int d1=d/2;
					int d2=d1+d1;   

					int dstart = 0;
					int dend =d1;
					char dbuf[] = new char[dend - dstart];
					mole.getChars(dstart ,dend, dbuf, 0);
					String ds1 = new String(dbuf);

					int dstart1 = d1;
					int dend1 =d2;
					char dbuf1[] = new char[dend1 - dstart1];
					mole.getChars(dstart1, dend1, dbuf1, 0);
					String ds2 = new String(dbuf1);
					
					int dstart2 = d2;
					int dend2 =d;
					char dbuf2[] = new char[dend2 -dstart2];
					mole.getChars(dstart2, dend2, dbuf2, 0);
					String ds3 = new String(dbuf2);
					

					int e =blood.length();

					int e1=e/2;
					int e2=e1+e1;  

					int estart = 0;
					int eend =e1;
					char ebuf[] = new char[eend - estart];
					blood.getChars(estart ,eend, ebuf, 0);
					String es1 = new String(ebuf);

					int estart1 = e1;
					int eend1 =e2;
					char ebuf1[] = new char[eend1 - estart1];
					blood.getChars(estart1, eend1, ebuf1, 0);
					String es2 = new String(ebuf1);
					
					int estart2 = e2;
					int eend2 =e;
					char ebuf2[] = new char[eend2 -estart2];
					blood.getChars(estart2, eend2, ebuf2, 0);
					String es3 = new String(ebuf2);
					
					int f =martial.length();

					int f1=f/2;
					int f2=f1+f1;  

					int fstart = 0;
					int fend =f1;
					char fbuf[] = new char[fend - fstart];
					martial.getChars(fstart ,fend, fbuf, 0);
					String fs1 = new String(fbuf);

					int fstart1 = f1;
					int fend1 =f2;
					char fbuf1[] = new char[fend1 - fstart1];
					martial.getChars(fstart1, fend1, fbuf1, 0);
					String fs2 = new String(fbuf1);
					
					int fstart2 = f2;
					int fend2 =f;
					char fbuf2[] = new char[fend2 -fstart2];
					martial.getChars(fstart2, fend2, fbuf2, 0);
					String fs3 = new String(fbuf2);
					
					int g =occupation.length();

					int g1=g/2;
					int g2=g1+g1;  

					int gstart = 0;
					int gend =g1;
					char gbuf[] = new char[gend - gstart];
					occupation.getChars(gstart ,gend, gbuf, 0);
					String gs1 = new String(gbuf);

					int gstart1 = g1;
					int gend1 =g2;
					char gbuf1[] = new char[gend1 - gstart1];
					occupation.getChars(gstart1, gend1, gbuf1, 0);
					String gs2 = new String(gbuf1);
					
					int gstart2 = g2;
					int gend2 =g;
					char gbuf2[] = new char[gend2 -gstart2];
					occupation.getChars(gstart2, gend2, gbuf2, 0);
					String gs3 = new String(gbuf2);
					
					int h =ethnicity.length();

					int h1=h/2;
					int h2=h1+h1;  

					int hstart = 0;
					int hend =h1;
					char hbuf[] = new char[hend - hstart];
					ethnicity.getChars(hstart ,hend, hbuf, 0);
					String hs1 = new String(hbuf);

					int hstart1 = h1;
					int hend1 =h2;
					char hbuf1[] = new char[hend1 - hstart1];
					ethnicity.getChars(hstart1, hend1, hbuf1, 0);
					String hs2 = new String(hbuf1);
					
					int hstart2 = h2;
					int hend2 =h;
					char hbuf2[] = new char[hend2 -hstart2];
					ethnicity.getChars(hstart2, hend2, hbuf2, 0);
					String hs3 = new String(hbuf2);
					
					
					int i =diseases.length();

					int i1=i/2;
					int i2=i1+i1;  

					int istart = 0;
					int iend =i1;
					char ibuf[] = new char[iend - istart];
					diseases.getChars(istart ,iend, ibuf, 0);
					String is1 = new String(ibuf);

					int istart1 = i1;
					int iend1 =i2;
					char ibuf1[] = new char[iend1 - istart1];
					diseases.getChars(istart1, iend1, ibuf1, 0);
					String is2 = new String(ibuf1);
					
					int istart2 = i2;
					int iend2 =i;
					char ibuf2[] = new char[iend2 -istart2];
					diseases.getChars(istart2, iend2, ibuf2, 0);
					String is3 = new String(ibuf2);
					
					int l =name1.length();

					int l1=l/2;
					int l2=l1+l1;  

					int lstart = 0;
					int lend =l1;
					char lbuf[] = new char[lend - lstart];
					name1.getChars(lstart ,lend, lbuf, 0);
					String ls1 = new String(lbuf);

					int lstart1 = l1;
					int lend1 =l2;
					char lbuf1[] = new char[lend1 - lstart1];
					name1.getChars(lstart1, lend1, lbuf1, 0);
					String ls2 = new String(lbuf1);
					
					int lstart2 = l2;
					int lend2 =l;
					char lbuf2[] = new char[lend2 -lstart2];
					name1.getChars(lstart2, lend2, lbuf2, 0);
					String ls3 = new String(lbuf2);
					
					
					int o =smoke.length();

					int o1=o/2;
					int o2=o1+o1;  

					int ostart = 0;
					int oend =o1;
					char obuf[] = new char[oend - ostart];
					smoke.getChars(ostart ,oend, obuf, 0);
					String os1 = new String(obuf);

					int ostart1 = o1;
					int oend1 =o2;
					char obuf1[] = new char[oend1 - ostart1];
					smoke.getChars(ostart1, oend1, obuf1, 0);
					String os2 = new String(obuf1);
					
					int ostart2 = o2;
					int oend2 =o;
					char obuf2[] = new char[oend2 -ostart2];
					smoke.getChars(ostart2, oend2, obuf2, 0);
					String os3 = new String(obuf2);
					
					
					int m =allergies.length();

					int m1=m/2;
					int m2=m1+m1;  

					int mstart = 0;
					int mend =m1;
					char mbuf[] = new char[mend - mstart];
					allergies.getChars(mstart ,mend, mbuf, 0);
					String ms1 = new String(mbuf);

					int mstart1 = m1;
					int mend1 =m2;
					char mbuf1[] = new char[mend1 - mstart1];
					allergies.getChars(mstart1, mend1, mbuf1, 0);
					String ms2 = new String(mbuf1);
					
					int mstart2 = m2;
					int mend2 =m;
					char mbuf2[] = new char[mend2 -mstart2];
					allergies.getChars(mstart2, mend2, mbuf2, 0);
					String ms3 = new String(mbuf2);
					
					
					//String x="not view";
					
					
					
					Connection con=null;
					Class.forName("com.mysql.jdbc.Driver");

					con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
					java.sql.PreparedStatement ps=con.prepareStatement("insert into data(id,name,height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies) values('"+id1+"',AES_ENCRYPT('"+ls1+"','key'),AES_ENCRYPT('"+s1+"','key'),AES_ENCRYPT('"+as1+"','key'),AES_ENCRYPT('"+bs1+"','key'),AES_ENCRYPT('"+cs1+"','key'),AES_ENCRYPT('"+ds1+"','key'),AES_ENCRYPT('"+es1+"','key'),AES_ENCRYPT('"+fs1+"','key'),AES_ENCRYPT('"+gs1+"','key'),AES_ENCRYPT('"+hs1+"','key'),AES_ENCRYPT('"+is1+"','key'),AES_ENCRYPT('"+os1+"','key'),AES_ENCRYPT('"+ms1+"','key'))");
					
					ps.executeUpdate();

					Connection con1=null;
					Class.forName("com.mysql.jdbc.Driver");

					con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
					java.sql.PreparedStatement ps1=con1.prepareStatement("insert into data1(id,name,height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies) values('"+id1+"',AES_ENCRYPT('"+ls2+"','key'),AES_ENCRYPT('"+s2+"','key'),AES_ENCRYPT('"+as2+"','key'),AES_ENCRYPT('"+bs2+"','key'),AES_ENCRYPT('"+cs2+"','key'),AES_ENCRYPT('"+ds2+"','key'),AES_ENCRYPT('"+es2+"','key'),AES_ENCRYPT('"+fs2+"','key'),AES_ENCRYPT('"+gs2+"','key'),AES_ENCRYPT('"+hs2+"','key'),AES_ENCRYPT('"+is2+"','key'),AES_ENCRYPT('"+os2+"','key'),AES_ENCRYPT('"+ms2+"','key'))");
					ps1.executeUpdate();

					Connection con11=null;
					Class.forName("com.mysql.jdbc.Driver");

					con11=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
					java.sql.PreparedStatement ps11=con11.prepareStatement("insert into data2(id,name,height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies) values('"+id1+"',AES_ENCRYPT('"+ls3+"','key'),AES_ENCRYPT('"+s3+"','key'),AES_ENCRYPT('"+as3+"','key'),AES_ENCRYPT('"+bs3+"','key'),AES_ENCRYPT('"+cs3+"','key'),AES_ENCRYPT('"+ds3+"','key'),AES_ENCRYPT('"+es3+"','key'),AES_ENCRYPT('"+fs3+"','key'),AES_ENCRYPT('"+gs3+"','key'),AES_ENCRYPT('"+hs3+"','key'),AES_ENCRYPT('"+is3+"','key'),AES_ENCRYPT('"+os3+"','key'),AES_ENCRYPT('"+ms3+"','key'))");
					ps11.executeUpdate();
					
					
					Connection con4=null;
					Class.forName("com.mysql.jdbc.Driver");

					con4=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","root");
					java.sql.PreparedStatement ps4=con4.prepareStatement("select height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies from data1 where id='"+id1+"'");
					ResultSet rs4=(ResultSet) ps4.executeQuery();
					
					while(rs4.next())
					{
						//Report ra=new Report(); 
						
						
						height=rs4.getString(1);
						weight=rs4.getString(2);
						eye=rs4.getString(3);
						hair=rs4.getString(4);
						mole=rs4.getString(5);
						blood=rs4.getString(6);
						martial=rs4.getString(7);
						occupation=rs4.getString(8);
						ethnicity=rs4.getString(9);
						 diseases=rs4.getString(10);
						 smoke=rs4.getString(11);
						 allergies=rs4.getString(12);
						//userArray6.add(ra);
						
						
					}
					System.out.println("Encrypetion process");
					 String[] en={height,weight,eye,hair,mole,blood,martial,occupation,ethnicity,diseases,smoke,allergies};
					for(int ii=0;ii<12;ii++){
						  System.out.println(en[ii]);
						 
					try
					  {
					  Thread.sleep(1000);  
					 
					  }
					
					catch (Exception e22){  
						e22.printStackTrace();
						
				  } }
					
						return "success";
						
					}
				
					}
