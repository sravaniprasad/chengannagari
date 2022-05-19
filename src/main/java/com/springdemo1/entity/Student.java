package com.springdemo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentid;
	
	
	@Column(length=30,nullable=false)
	private String studentname;
	
	@Column(length=30,nullable=false)
	private String Studentemail;
	
	@Column(length=30,nullable=false)
	private String studentcontact;
	

}
