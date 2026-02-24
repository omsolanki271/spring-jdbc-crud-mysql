package com.spring.jdbc.dao;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;


public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String query = "insert into student(stid,stnm,city) values(?,?,?)";
		int res = this.jdbcTemplate.update(query,student.getStid(),student.getStnm(),student.getCity());
		return res;
	}

	@Override
	public int change(Student student) {
		String query = "update student set stnm=?, city=? where stid=?";
		int res = this.jdbcTemplate.update(query,student.getStnm(),student.getCity(),student.getStid());
		return res;
	}

	@Override
	public int delete(int studentId) {
		String query = "delete from student where stid=?";
		int res = this.jdbcTemplate.update(query,studentId);
		return res;
	}	
	//use for only one studetn value get 
	@Override
	public Student getStudent(int StudentId) {
		String query = "select * from student where stid=?";

		// implimentation in other class other wise create Annonoumn class 
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student stud = this.jdbcTemplate.queryForObject(query,rowMapper,StudentId);
		return stud;
	}
	
	
	
	/*
	 * @Override public List<Student> getAllStudents() {
	 * 
	 * String query = "select * from student";
	 * 
	 * RowMapper<Student> rowMapper = new RowMapper<Student>() {
	 * 
	 * public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	 * 
	 * Student s = new Student(); s.setStid(rs.getInt("stid"));
	 * s.setStnm(rs.getString("stnm")); s.setCity(rs.getString("city"));
	 * 
	 * return s; } }; return this.jdbcTemplate.query(query, rowMapper); }
	 */	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	
}
