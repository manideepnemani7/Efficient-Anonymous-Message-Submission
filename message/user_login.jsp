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
  <div id="loggg">
  
<form action="profile" name="profile" method=post>
<div id="sss">

<div id="ss11"><font color="pink" size="2"><b>User Profile</b></font></div>
<div id="ssx"><input type="submit" value="  view "></div></div></form>
<form action="apply" name="apply" method=post>
<div id="sss">

<div id="ss11"><font color="pink" size="2"><b>Online Health Survey</b></font></div>
<div id="ssx"><input type="submit" value="  click "></div></div></form>

<form action="userview" name="userview" method=post>
<div id="sss">

<div id="ss11"><font color="pink" size="2"><b>Survey Details</b></font></div>
<div id="ssx"><input type="submit" value="  view "></div></div></form>
<form action="logout" name="logout" method=post>
<div id="ss11"></div>
<div id="ssx">
<input type="submit" value="Logout"></div></form>
</div>

  <div id="foot"> 
  
  </div>
 
</div>

</body>
</html>
