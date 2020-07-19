package com.zdh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class myHelloWorldController {

	@RequestMapping("/h1")
	public String helloTest1(Model model)
	{
		User user=new User();
		user.setUname("zdh");
		user.setAge(20);
		
		model.addAttribute(user);
		model.addAttribute("Message1","HelloWorld");
		
		return "hello";
	}
	
	
	@RequestMapping("/h2")
	public  ModelAndView helloTest1()
	{
		User user=new User();
		user.setUname("zdh1");
		user.setAge(201);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject(user);
		mv.setViewName("hello");
		
		return mv;
	}
}
