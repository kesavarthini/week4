package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@Autowired
	private StudentDAO studentDao;

	@RequestMapping("/")
	public String getPage()
	{
		return "enroll.jsp";
	}
	@RequestMapping("/addStudent")
	public String add(Student s)
	{  
		studentDao.save(s);
		return "enroll.jsp";
	}
}
