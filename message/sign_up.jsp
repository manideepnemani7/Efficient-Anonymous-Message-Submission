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
<script src="js/jey.js" 	type="text/javascript"></script>
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

  <div id="logg">
   
  <form name="signup" action="signup" method=post>
  
 
    <font color="white" size="4">Sign up</font>
    <div id="sss">

<div id="ss"><font color="pink" size="3">User Id:</font></div>
<div id="ssx"><input type="text" name="id" id="id" value="<%= (int) (Math.random() * 100) %>"></div></div>

  <div id="sss">

<div id="ss"><font color="pink" size="3">User Name:</font></div>
<div id="ssx"><input type="text" name="name" id="name" placeholder="enter your name?"></div></div>
 <div id="sss">
<div id="ss"><font color="pink" size="3">Password :</font></div>
<div id="ssx"><input type="password" name="password" id="password" placeholder="enter your password?"></div></div>
<div id="sss">
<div id="ss"><font color="pink" size="3">Age :</font></div>
<div id="ssx"><input type="text" name="age" id="age" placeholder="enter your age?"></div></div>
<div id="sss">
<div id="ss"><font size="3" color="pink">I Am   :</font>
          </div>
          <div id="ssx"><select name="gender" id="gender">
		  <option value="0">select sex:</option>
		  <option value="male">Male</option>
		  <option value="female">Female</option>
		  </select></div></div>
		  
		<div id="ss1">
<input id="submit" type="submit" value="submit"/></div>
  </form>
 </div>

  <div id="foot"> 
  
  </div>
 
</div>

</body>
</html>
