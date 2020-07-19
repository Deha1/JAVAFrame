package com.zsp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
	
	public static void main(String[] args) 
	{
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
	    
		myCellPhone cp=(myCellPhone)context.getBean("cp");
		cp.run();
	}
}
