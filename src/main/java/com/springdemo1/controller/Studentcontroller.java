package com.springdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springdemo1.entity.Student;
import com.springdemo1.service.StudentServices;

@Controller
public class Studentcontroller {

	@Autowired
	StudentServices studentservice;
	
	@GetMapping("/home")
	public String home() {
		
		Student student=new Student();
		
		student.setStudentname("sravani");
		student.setStudentemail("srav@gmail.com");
		student.setStudentcontact("7659932939");
		
//		student.setStudentname("sravanthi");
//		student.setStudentemail("sravs@gmail.com");
//		student.setStudentcontact("876832939");
		
		this.studentservice.addStudent(student);
		
		
		return "home";
		
	}
	
	
}
