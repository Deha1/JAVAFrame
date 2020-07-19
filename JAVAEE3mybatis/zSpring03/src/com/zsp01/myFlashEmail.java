package com.zsp01;

import org.springframework.stereotype.Component;

@Component//实例化此对象，将其交给spring容器来管理
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
