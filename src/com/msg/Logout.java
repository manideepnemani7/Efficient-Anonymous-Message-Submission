package com.msg;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Logout {
public String execute()
{
	Map<?, ?> session = ActionContext.getContext().getSession();
	session.remove("name"); 
	session.remove("id");
	
	return "success";
	
}

}
