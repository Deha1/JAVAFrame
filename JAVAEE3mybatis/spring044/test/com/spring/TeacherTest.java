package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.config.JavaConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JavaConfig.class})
public class TeacherTest {
	
	@Autowired
	private Teacher teacher;
	
	@Test
	public void test()
	{
		//teacher01= new Teacher01();
		//自动装配Teacher01的对象
		teacher.teach();
		
		
	}
	
	
}
