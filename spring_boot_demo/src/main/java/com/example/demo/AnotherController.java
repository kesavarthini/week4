package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller 
public class AnotherController {

	public  AnotherController() {
	
		// TODO Auto-generated constructor stub
		System.out.println("Another Controller created..");
	}
	

     @RequestMapping("/")
//     @ResponseBody
	  public String Greet()
	  {
	
		  return "login";
	  }
     
     @RequestMapping("/verify")
     public String verifyMethod(HttpServletRequest req)
     {   
    	 //method2
    	 String nameString=req.getParameter("user");
    	 System.out.println("Name: "+nameString);
    	 HttpSession session=req.getSession();
    	 session.setAttribute("uname", nameString);
    	 req.setAttribute("name", nameString);
    	 return "welcome";
     }
     @RequestMapping("/verify2")
     public String verifyMethod2(@RequestParam ("user") String name,String password,HttpSession session)
     {   //method2
    
    	 System.out.println("Name: "+name);
         session.setAttribute("uname", name);
    	 return "welcome";
     }
     @RequestMapping("/verify3")
     public String verifyMethod3(String user,String pwd,HttpSession session)
     {   //method3
    
         session.setAttribute("uname", user);
         session.setAttribute("pwd", pwd);
    	 return "welcome";
     }
     @RequestMapping("/verify4")
     public ModelAndView verifyMethod4(Person p)
     {   //method4 Preferred Method
         ModelAndView mView=new ModelAndView();
         mView.addObject("person",p);
         mView.setViewName("LoggedIn");
    	 return mView;
     }
}