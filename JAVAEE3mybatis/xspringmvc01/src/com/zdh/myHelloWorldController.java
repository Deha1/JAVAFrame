package com.zdh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myHelloWorldController {
	
	@RequestMapping("/admin/hi")
	public String helloWorld(Model model)
	{
		model.addAttribute("message", "Hello World!");
        return "hello";
	}
}
