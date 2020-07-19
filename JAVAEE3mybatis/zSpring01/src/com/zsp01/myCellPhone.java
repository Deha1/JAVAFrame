package com.zsp01;

public class myCellPhone {
	private myEmail email;
	private String name;
	
	public void run() 
	{
		System.out.println("---->"+name+"<----");
		email.send();
		email.receive();
	}

	public myEmail getEmail() {
		return email;
	}

	public void setEmail(myEmail email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
