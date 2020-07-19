package com.zdh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
@RequestMapping("/admin")
public class myHelloWorldController {
	
	@RequestMapping("/h1")
	public ModelAndView test1(HttpServletRequest request)//有了String uname之后可以自动绑定
	{
		//在request中找"uname"的值 
		String userName=  WebUtils.findParameterValue(request,"uname");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");//代替return "hello";语句
		mv.addObject("uname",userName);
		return mv;
	}

	
	
	@RequestMapping(value = "/h2")
	public String test2(HttpSession session)
	{
		session.setAttribute("sessionId", 1221);
		return "hello";
		
	}
	
	@RequestMapping("/img3.htm")
	public void imgs(OutputStream os,HttpServletResponse resp)
	{
		resp.setContentType("image/jpeg");
		BufferedImage img=new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		Graphics g=img.getGraphics();
		g.setColor(new Color(220,220,220));
		g.fillRect(0, 0, 100, 30);
		g.setColor(Color.RED);
		g.drawString("Hello", 40, 15);
		
		try {
			ImageIO.write(img, "jpeg", os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
