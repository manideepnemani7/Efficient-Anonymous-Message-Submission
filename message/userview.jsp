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
<script src="js/jey1.js" 	type="text/javascript"></script>
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
  <div id="ss">
  <font color="orange" size="2"><b>WELCOME:</b></font><font color="white" size="2">
  <b><s:property value="#session.name" /></b></font>
  </div>
  <br>
  


<table><tr><td bgcolor="skyblue">Height</td><td bgcolor="skyblue">Weight</td><td bgcolor="skyblue">Eye Color</td><td bgcolor="skyblue">Hair Color</td>
<td bgcolor="skyblue">Birth mark/Mole</td><td bgcolor="skyblue">Blood Group</td><td bgcolor="skyblue">Martial Status</td>
<td bgcolor="skyblue">Occupation</td><td bgcolor="skyblue">Ethnicity</td><td bgcolor="skyblue">Diseases</td>
<td bgcolor="skyblue">Smoking</td><td bgcolor="skyblue">Allergies</td></tr>
<tr><s:iterator value="userArray">
<tr><td bgcolor="white"><s:property value="height" /></td>
<td bgcolor="white"><s:property value="weight" /></td>
<td bgcolor="white"><s:property value="eye" /></td>
<td bgcolor="white"><s:property value="hair" /></td>
<td bgcolor="white"><s:property value="mole" /></td>
<td bgcolor="white"><s:property value="blood" /></td>
<td bgcolor="white"><s:property value="martial" /></td>
<td bgcolor="white"><s:property value="occupation" /></td>
<td bgcolor="white"><s:property value="ethnicity" /></td>
<td bgcolor="white"><s:property value="diseases" /></td>
<td bgcolor="white"><s:property value="smoke" /></td>
<td bgcolor="white"><s:property value="allergies" /></td>
</s:iterator></tr>
       
</table>



  <div id="foot"> 
  
  </div>
 
</div>

</body>
</html>
