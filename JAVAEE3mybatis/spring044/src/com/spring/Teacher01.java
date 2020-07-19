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
		System.out.println("初始化老师");
	}
	
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("teacher01在上课");
		stu.learn();
		
	}
	
	

}
