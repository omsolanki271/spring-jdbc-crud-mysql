package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int StudentId);
	
	//use only single student 
	public Student getStudent(int StudetnId);
	
	
	/* public List<Student> getAllStudents(); */
	
}
