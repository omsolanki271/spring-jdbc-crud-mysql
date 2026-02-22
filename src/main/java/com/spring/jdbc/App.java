package com.spring.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started .....");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");

		int choice = sc.nextInt();

		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		switch (choice) {

		case 1:
			System.out.println("Enter Id:");
			int id1 = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Name:");
			String name1 = sc.nextLine();

			System.out.println("Enter City:");
			String city1 = sc.nextLine();

			Student student1 = new Student(id1, name1, city1);
			int insertResult = dao.insert(student1);
			System.out.println(insertResult + " Row inserted");
			break;

		case 2:
			System.out.println("Enter Id to update:");
			int id2 = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter New Name:");
			String name2 = sc.nextLine();

			System.out.println("Enter New City:");
			String city2 = sc.nextLine();

			Student student2 = new Student(id2, name2, city2);
			int updateResult = dao.change(student2);
			System.out.println(updateResult + " Row updated");
			break;

		case 3:
			System.out.println("Enter Id to delete:");
			int deleteId = sc.nextInt();

			int deleteResult = dao.delete(deleteId);
			System.out.println(deleteResult + " Row deleted");
			break;

		default:
			System.out.println("Invalid choice");
		}

	}
}
