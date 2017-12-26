 $(document).ready(function(){
 $("#submit").click(function() {
	 if($("#name").val()=="") 
			
		{
		alert("enter your name");
		$("#name").focus();
		return false;
		}
	
	if($("#password").val()=="") 
		
	{
	alert("enter your password");
	$("#password").focus();
	return false;
	}
	var a=/^[0-9]+$/;
	if(!$("#age").val().match(a)) 
		
	{
	alert("enter your age");
	$("#age").focus();
	return false;
	}
	if($("#gender").val()=="0") 
	//if(document.s.log.selectedIndex==0)
	{
	alert("Select Gender");
	$("#gender").focus();
	return false;
	}

	
});
});
