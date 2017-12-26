 $(document).ready(function(){
 $("#submit").click(function() {
	 var a=/^[0-9]+$/;
		if(!$("#height").val().match(a)) 
			
		{
		alert("enter your height");
		$("#height").focus();
		return false;
		}
	
		var b=/^[0-9]+$/;
		if(!$("#weight").val().match(b)) 
			
		{
		alert("enter your weight");
		$("#weight").focus();
		return false;
		}
	
      if($("#eye").val()=="") 
			
		{
		alert("enter your eye color");
		$("#eye").focus();
		return false;
		}
          
      if($("#hair").val()=="") 
	
        {
        alert("enter your hair color");
         $("#hair").focus();
        return false;
          }
      if($("#mole").val()=="") 
    		
      {
      alert("enter your scars/birth mark");
       $("#mole").focus();
      return false;
        }
      if($("#blood").val()=="") 
  		
      {
      alert("enter your blood group");
       $("#blood").focus();
      return false;
        }
      if($("#martial").val()=="0") 
    		//if(document.s.log.selectedIndex==0)
    		{
    		alert("Select your martial status");
    		$("#martial").focus();
    		return false;
    		}
      if($("#occupation").val()=="") 
    		
      {
      alert("enter your occupation");
       $("#occupation").focus();
      return false;
        }
      if($("#ethnicity").val()=="0") 
  		//if(document.s.log.selectedIndex==0)
  		{
  		alert("Select your  ethnicity");
  		$("#ethnicity").focus();
  		return false;
  		}
     
});
});
