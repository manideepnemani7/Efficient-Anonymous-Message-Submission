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
<table><tr><td bgcolor="skyblue">User Id</td><td bgcolor="skyblue">Name</td>
<td bgcolor="skyblue">Age</td><td bgcolor="skyblue">Gender</td>
</tr>
<tr><s:iterator value="userArray2">
<tr><td bgcolor="white"><s:property value="id" /></td>
<td bgcolor="white"><s:property value="name" /></td>
<td bgcolor="white"><s:property value="age" /></td>
<td bgcolor="white"><s:property value="gender" /></td>


</s:iterator></tr>
       
</table>
</div>

  <div id="foot"> 
  
  </div>
 
</div>

</body>
</html>
