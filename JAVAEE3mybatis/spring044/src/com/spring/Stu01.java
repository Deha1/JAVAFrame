package com.spring;

public class Stu01 implements Student{

	public Stu01()
	{
		System.out.println("初始化学生");
	}
	
	
	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("stu01 正在学习");
	}

}
