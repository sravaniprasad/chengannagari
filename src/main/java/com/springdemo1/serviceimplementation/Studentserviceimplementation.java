package com.springdemo1.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo1.entity.Student;
import com.springdemo1.repository.StudentRepo;
import com.springdemo1.service.StudentServices;

@Service
public class Studentserviceimplementation implements StudentServices{
	
	@Autowired
	StudentRepo studentrepo;

	@Override
	public void addStudent(Student student) {
		
		this.studentrepo.save(student);
		
	}

	
	
	
	
	
	
}
