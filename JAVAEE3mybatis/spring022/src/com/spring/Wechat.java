package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Wechat implements ChatApp{

	public Wechat()
	{
		System.out.println("create wechat account");
	}
	
	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("send wechat message");
	}

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("receive wechat message");
	}
	

}
