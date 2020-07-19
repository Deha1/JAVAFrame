package com.zdh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myHelloMyController {
	@RequestMapping("/admin/hi")
	public String helloWorld(Model mod)
	{
		mod.addAttribute("message1","helloworldzdh!");
		return "hello";
	}
	
	@RequestMapping("/admin/helloSer.htm")
	public void helloServlet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html,charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>ServletWshSB<h1>");
		out.close();
	}

}
