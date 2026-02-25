package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class JavaConfig {
		
	@Bean(name={"ds"})
	// or use DriverManagerDataSource in method for return type
	public DataSource getDtSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/springjdbc");
		ds.setUsername("root");
		ds.setPassword("abc123");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDtSource());
		return jdbcTemplate;
	}
	
	
	// without Autowiring 
	
	/*
	 * @Bean(name="studentDao")
	 * 
	 * public StudentDao getstdao() { StudentDaoImp dao = new StudentDaoImp();
	 * dao.setJdbcTemplate(getTemplate()); return dao; }
	 */
	
	
	
}
