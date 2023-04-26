package com.raju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raju.Student;
import com.raju.service.StudentService;

@Controller
public class StudentController {
	//Sending Data from controller to UI
	@Autowired
private StudentService service;
	@GetMapping("/")
	public String loadIndexpage(Model mv) {
		Student st=new Student();
	
		FormBinding(mv, st);
		
		
		return "index";
	}
	private void FormBinding(Model mv, Student st) {
		mv.addAttribute("student", st);
		System.out.println("Obj Created");
		mv.addAttribute("courses",service.courseList());
		mv.addAttribute("timings",service.getTiming());
	}
	@PostMapping("/run")
	//Capturing data from UI to controller By using student OBj to check the reference variable
	//--in Student 
	public String saveStudent(@ModelAttribute("student") Student s,Model mv) {
		mv.addAttribute("msg", "Your Data has been saved sucessfully..We return in short..!");
		mv.addAttribute("student", s);
		//System.out.println("Obj Created");
		mv.addAttribute("courses",service.courseList());
		mv.addAttribute("timings",service.getTiming());
		service.saveStudent(s);
		
		System.out.println(s);
		return "index";
	}
	

}
