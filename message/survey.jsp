<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

<title>EFFICIENT ANONYMOUS MESSAGE SUBMISSION</title>
<link rel="stylesheet" type="text/css" href="./css/default.css" media="screen" />
<link rel="stylesheet" type="text/css" href="./css/print.css" media="print" />
<link rel="stylesheet" type="text/css" href="css/Signup.css" media="screen" />
<script src="js/jquery-1.7.1.js" 	type="text/javascript"></script>
<script src="js/jey2.js" 	type="text/javascript"></script>
</head>
<body>

<div id="view">
 
  <div id="head"> 
   
    <div id="main"> 
      <h1><font color="#FFFFFF" face="Times New Roman, Times, serif" >EFFICIENT ANONYMOUS MESSAGE SUBMISSION</font></h1>
     
      
    </div>
 
 
    <div id="mainMenu"> 
      <ul>
       <li><a href="home.jsp">HOME<span></span></a></li>
        <li><a href="user.jsp">USER<span></span></a></li>
        <li><a href="admin.jsp">ADMIN<span></span></a></li>
        <li><a href="collector.jsp">COLLECTOR<span></span></a></li>
        <li><a href="sign_up.jsp">SIGN UP<span></span></a></li>
        </ul>
    </div>
       
    <div id="logo"> <a href="" class="block">&nbsp;</a> 
      <h2></h2>
    </div>
   
   
  </div>
<br>
 

    <div id="survey">
  
  
 <form name="report" action="report" method=post>
    <font color="white" size="4">HEALTH SURVEY</font>
    <div id="sss">
 
<div id="ss11"><font color="pink" size="2"><b>Height    :*</b></font></div>
<div id="ssx"><input type="text" name="height" id="height" placeholder="enter your height?" size="26"><font color="pink" size="2"><b>cm</b></font></div></div>

  <div id="sss">

<div id="ss11"><font color="pink" size="2"><b>Weight    :*</b></font></div>
<div id="ssx"><input type="text" name="weight" id="weight" placeholder="enter your weight?" size="26"><font color="pink" size="2"><b>kg</b></font></div></div>
 <div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Eye Color:*</b></font></div>
<div id="ssx"><input type="text" name="eye" id="eye" placeholder="enter your eye color?" size="26"></div></div>
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Hair color :*</b></font></div>
<div id="ssx"><input type="text" name="hair" id="hair" placeholder="enter your hair color?" size="26"></div></div>
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Birth mark/Scars:*</b></font></div>
<div id="ssx"><input type="text" name="mole" id="mole" placeholder="enter your scars/birth mark?" size="26"></div></div>
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Blood Group:*</b></font></div>
<div id="ssx"><input type="text" name="blood" id="blood" placeholder="enter your blood group?" size="26"></div></div>	
<div id="sss">
<div id="ss11"><font size="2" color="pink"><b>Martial Status:*</b></font>
          </div>
          <div id="ssx"><select name="martial" id="martial">
		  <option value="0">select status:</option>
		  <option value="married">Married</option>
		  <option value="unmarried">Unmarried</option>
		  </select></div></div>		
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Occupation:*</b></font></div>
<div id="ssx"><input type="text" name="occupation" id="occupation" placeholder="enter your occupation" size="26"></div></div>	  
<div id="sss">
<div id="ss11"><font size="2" color="pink"><b>Ethnicity:*</b></font>
          </div>
          <div id="ssx"><select name="ethnicity" id="ethnicity">
		  <option value="0">select ethnicity:</option>
		  <option value="White British">White British</option>
		  <option value="White Irish">White Irish</option>
		  <option value="White and Black Caribbean">White and Black Caribbean</option>
		  <option value="White and Black African">White and Black African</option>
		  <option value="White and Asian">White and Asian</option>
		  <option value="Indian">Indian</option>
		  <option value="Chinese">Chinese</option>
		  <option value="Bangladeshi">Bangladeshi</option>
		  </select></div></div>		
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Diseases:</b></font></div>
<div id="ssx"><input type="checkbox" name="diseases" id="diseases" value="dengue fever"><font color="white" size="2">Dengue fever</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="diabetes"><font color="white" size="2">Diabetes</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="cancer"><font color="white" size="2">Cancer</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="asthma"><font color="white" size="2">Asthma</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="common cold"><font color="white" size="2">Common cold</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="headaches"><font color="white" size="2">Headaches</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="Migraine"><font color="white" size="2">Migraine</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="Influenza"><font color="white" size="2">Influenza</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="Malaria"><font color="white" size="2">Malaria</font>
<br>
<input type="checkbox" name="diseases" id="diseases" value="Polio"><font color="white" size="2">Polio</font></div></div>
<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Do You Smoking?</b></font></div>
<div id="ssx"><input type="radio" name="smoke" id="smoke" value="yes"><font color="white" size="2">Yes</font>
<input type="radio" name="smoke" id="smoke" value="no"><font color="white" size="2">No</font></div></div>	

<div id="sss">
<div id="ss11"><font color="pink" size="2"><b>Allergies:</b></font></div>
<div id="ssx"><input type="checkbox" name="allergies" id="allergies" value="Food"><font color="white" size="2">Food</font>
<br>
<input type="checkbox" name="allergies" id="allergies" value="travel"><font color="white" size="2">Travel</font>
<br>
<input type="checkbox" name="allergies" id="allergies" value="smoking"><font color="white" size="2">Smoking</font>
</div></div>
<div id="ss1">
<input id="submit" type="submit" value="submit" size="25"/></div>
  </form>
</div>

  <div id="foot"> 
  
  </div>
 
</div>


</body>
</html>
