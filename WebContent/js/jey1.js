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
	

	
});
});
