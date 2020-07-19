package com.zsp01;

import org.springframework.stereotype.Component;

@Component
public class myFlashEmail implements myEmail {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("收邮件");
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("发邮件");
	}

}
