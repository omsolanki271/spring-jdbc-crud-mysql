package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
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
	public int delete(Student student) {
		String query = "delete from student where stid=?";
		int res = this.jdbcTemplate.update(query,student.getStid());
		return res;
	}	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
