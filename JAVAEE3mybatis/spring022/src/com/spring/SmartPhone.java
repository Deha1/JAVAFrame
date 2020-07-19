package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartPhone {
	
	
	
	@Autowired
	private Wechat wechat;
	private String name="iphone";
	
	public SmartPhone()
	{
		System.out.println("use cellphone");
	}
	
	public void run()
	{
		System.out.println("---->"+name+"<----");
		wechat.sendMessage();
		wechat.getMessage();
	}

	

	
	
	
	
}
