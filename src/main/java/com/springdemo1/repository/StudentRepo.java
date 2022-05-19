package com.springdemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo1.entity.Student;

public interface StudentRepo  extends JpaRepository<Student,Integer>{

}
