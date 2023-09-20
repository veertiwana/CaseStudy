package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Data

public class Student {
	
	int roll;
	char grade;
	
	String name;

	
	public Student(String name, int roll, char grade) {
		super();
		this.name=name;
		this.roll=roll;
		this.grade=grade;
	}
//	public S

Student() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
