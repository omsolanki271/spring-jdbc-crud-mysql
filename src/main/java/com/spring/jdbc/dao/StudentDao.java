package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int StudentId);
	
	//use only single student object
	public Student getSingleStudent(int StudentId);
	
	/* public List<Student> getAllStudents(); */
	
	public List<Student> getAllStudent();
	
	
	
	
}
