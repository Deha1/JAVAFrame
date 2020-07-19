package com.zdh;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/admin")
public class myHelloWorldController {
	
	
	
	@RequestMapping(value = "/h1")
	//�൱��request.setAttribute();������Ҳ�ȼ����ڷ�������ʱ����model��Ȼ��model.addattribute()
	public String handle61(@ModelAttribute("user") User user,HttpSession session) {
		user.setAge(23);
		session.setAttribute("user",user);
		return "hello";
	}
	
	@RequestMapping(value = "/h2")
	public String handle63(ModelMap modelMap) 
	{
		//User user = (User) modelMap.get("user");
		//user.setUname("����");
		modelMap.addAttribute("testAttr", "value1");
		return "hello";
	}
	
	
	@RequestMapping(value = "/h3")
	
	public String handle71(@ModelAttribute("user") User user) 
 	{
		user.setUname("wangwu");
		//return "redirect:http://www.baidu.com";
		return "hello";
		// redirect:   ��forward:
	}
	
}
