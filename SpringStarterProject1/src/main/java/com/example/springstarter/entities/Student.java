package com.example.springstarter.entities;

import org.springframework.stereotype.Component;

@Component
public class Student
{
	private int id;
	private String Name;
	
	public Student() {
		super();
		System.out.println("B1-4 students");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void display()
	{
		System.out.println("Student class");
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}