package com.zsp01;

import org.springframework.stereotype.Component;

@Component//ʵ�����˶��󣬽��佻��spring����������
public class myFlashEmail implements myEmail {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("���ʼ�");
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("���ʼ�");
	}

}
