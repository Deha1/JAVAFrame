package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) 
	{
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		
		SmartPhone sp=(SmartPhone)context.getBean("smartPhone");
		sp.run();
	}

}
