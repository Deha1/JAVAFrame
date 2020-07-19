package com.zdh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class myHelloWorldController {
	
	@RequestMapping("/h1")
	public String helloWorld1(Model mod)
	{
		mod.addAttribute("message1","helloWor1d");
		return "hello";
	}

	 @RequestMapping(value="/{day}", method=RequestMethod.GET)
	 public String getForDay(@PathVariable int day, Model model) 
	 {
		 model.addAttribute("day",day);
		 return "hello";
	 }
	
	
//	@RequestMapping("/h1h1")
//	public String handle1
//	(	@RequestParam("uname") String userName,
//		@RequestParam("upwd") String userPassword,
//		@RequestParam("urea") String realName,
//		Model model
//	)	
//	{
//		System.out.println(userName);
//		System.out.println(userPassword);
//		System.out.println(realName);
//		
//		model.addAttribute("uname",userName+"~");
//		return "hello";
//	}
	
	 	@RequestMapping("/h2h2")
		public String handle2
		(
				String uname,String upwd,String urea,Model model
		) 
	    {
	    	System.out.println(uname);
	    	System.out.println(upwd);
	    	System.out.println(urea);
	    	
	    	model.addAttribute("uname",uname+"~~");
			return "hello";
		}
	
	 	@RequestMapping("/h3.htm")
	 	public String testSession
	 	(
	 			@CookieValue("JSESSIONID") String sessionId,
	 			@RequestHeader("Accept-Language") String accpetLanguage,
	 			Model model
	 	)
	 	{
	 		model.addAttribute("cook",sessionId+"&nbsp;&nbsp;"+accpetLanguage);
	 		return "hello";
	 		
	 	}
	 	
	 	@RequestMapping("/h4")
	 	public String testUser(myUser user)
	 	{
	 		System.out.println(user.getUname());
	 		System.out.println(user.getAge());
	 		return "hello";
	 	}
	 	
	 	@RequestMapping("/hello1.htm")
	 	public void hello(HttpServletRequest req,HttpServletResponse resp) throws IOException
	 	{
	 		resp.setContentType("text/html;charset=utf-8");
	 		PrintWriter out = resp.getWriter();
	 		
	 		HttpSession session = req.getSession();
	 		session.setAttribute("aa", "aa");
	 		System.out.println(session.getAttribute("aa"));
	 		out.println("<h1>hello</h1>");
	    	out.close();
	 	}
}

