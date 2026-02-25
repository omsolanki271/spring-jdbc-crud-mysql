package com.omsolanki.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.omsolanki.springjdbc.entities.Student;

public class RowMapperImp implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStid(rs.getInt("stid"));
		student.setStnm(rs.getString("stnm"));
		student.setCity(rs.getString("city"));
		return student;
	}

}
