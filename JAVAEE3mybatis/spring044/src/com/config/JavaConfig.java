package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Stu01;
import com.spring.Student;
import com.spring.Teacher;
import com.spring.Teacher01;



@Configuration
public class JavaConfig {

	@Bean
	public Student newStu()
	{
		return new Stu01();
		
	}
	
	@Bean
	public Teacher newTeacher()
	{
		//return new Teacher01(newStu());
		return new Teacher01();
	}
	
}
