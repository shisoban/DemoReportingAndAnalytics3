package com.demoReportingAndAnalytics;

public class LoginAction {
	
	private Integer id;
	private String name;
	private String password;

	public LoginAction(Integer id, String name){
		this.id =id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
	if(password.equals("admin")){
		return "success";
	}
	else{
		return "error";
	}
	}

}
