package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My program started .....");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        //First implement this logic 
        //This is normal way to insert data 
        
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        String query = "insert into student(stid,stnm,city) values(?,?,?)";        
//        int result = template.update(query,106,"raghunath","GMC");
//        System.out.println("number of rows inserted...."+result);
        
        //Second step Insert data 
        /*
        StudentDao bean = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setStid(109);
        student.setStnm("Kajus");
        student.setCity("Porbandar");
        
        int result = bean.insert(student);
        System.out.println("number of rows inserted... "+result);
        System.out.println(student.getStid() +" | "+ student.getStnm()+" | "+student.getCity());
        */
        
        //Third Step update data
        /*
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
        student.setStid(106);
        student.setStnm("Ravi");
        student.setCity("Gandhinagar");
        
        int result = studentDao.change(student);
        System.out.println(result + "Row updated....");
        */
        
        //Fourth Step update data
        
       StudentDao dao =  context.getBean("studentDao",StudentDao.class);
       
       Student student = new Student();
       student.setStid(107);
       int del = dao.delete(student);
       System.out.println(del + " Rows deleted....");
       
    }
}
