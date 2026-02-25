package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class RowMapperImp implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStid(rs.getInt(1));
		student.setStnm(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
