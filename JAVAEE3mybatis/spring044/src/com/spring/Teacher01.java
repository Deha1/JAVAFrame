package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher01 implements Teacher{

	@Autowired
	private Student stu;
	
//	public Teacher01(Student student)
//	{
//		this.student=student;
//	}
//	
	
	public Teacher01()
	{
		System.out.println("��ʼ����ʦ");
	}
	
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("teacher01���Ͽ�");
		stu.learn();
		
	}
	
	

}
