package com.sbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbcrud.model.Student;
import com.sbcrud.repository.StudentRepositary;
import com.sbcrud.servicei.ServiceI;

@Controller
public class StudentController {
	@Autowired
	ServiceI sb;

	@RequestMapping("/")
	public String homePage() {
		return "homepage";
	}
  
	@RequestMapping("/addlist")
	public String addListPage()
	{
		return "addlist";
	}
	@RequestMapping("save")
	public String addListDisplayPage(@ModelAttribute Student st ,Model m) {
		
		m.addAttribute("sd", st);
		sb.saveStudent(st);
		
		return "addDisplay";
	}
}
