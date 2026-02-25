package com.omsolanki.springjdbc.dao;

import java.util.List;

import com.omsolanki.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(int StudentId);

	// use only single student object
	public Student getSingleStudent(int StudentId);

	/* public List<Student> getAllStudents(); */

	public List<Student> getAllStudent();

}
