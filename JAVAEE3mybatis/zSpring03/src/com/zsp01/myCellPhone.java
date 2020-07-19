package com.zsp01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class myCellPhone {
	@Autowired
	//从spring容器中找myEmail接口相对应的实现类，并将那个类型赋给此对象
	  myEmail email;
	  private String name="PhoneXX";
	  
	  public String run()
	  {
		  System.out.println("---->"+name+"<----");
		  email.send();
		  email.receive();
		  
		  return this.name;
	  }



	
}
