package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class MyAppController {
	public MyAppController() {
		// TODO Auto-generated constructor stub
		System.out.println("MyAppController created..");
	}
	
	
     @RequestMapping("/abc")
//     @ResponseBody
	  public String someMethod()
	  {
		  System.out.println("You have accessed /abc url path....");
		 // return "demo.html";
//		  return "<h1>This is the content as response to the client</h1>";
		  return "demo.jsp";
	  }
     
     @RequestMapping("/xyz")
     public String anotherMethod()
     {
    	 return "demo";
     }
    
}
