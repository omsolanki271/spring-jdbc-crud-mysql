package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {

	public static void main(String[] args) {

		System.out.println("My program started .....");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n----- MENU -----");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select One");
			System.out.println("5. Select All");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Id:");
				int id1 = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Name:");
				String name1 = sc.nextLine();

				System.out.println("Enter City:");
				String city1 = sc.nextLine();

				if (id1 <= 0) {
					System.out.println("Invalid Id. Must be greater than 0.");
					break;
				}

				if (name1.trim().isEmpty()) {
					System.out.println("Name cannot be empty.");
					break;
				}

				if (city1.trim().isEmpty()) {
					System.out.println("City cannot be empty.");
					break;
				}

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

				if (id2 <= 0) {
					System.out.println("Invalid Id. Must be greater than 0.");
					break;
				}

				if (name2.trim().isEmpty()) {
					System.out.println("Name cannot be empty.");
					break;
				}

				if (city2.trim().isEmpty()) {
					System.out.println("City cannot be empty.");
					break;
				}

				Student student2 = new Student(id2, name2, city2);
				int updateResult = dao.change(student2);
				System.out.println(updateResult + " Row updated");
				break;

			case 3:
				System.out.println("Enter Id to delete:");
				int deleteId = sc.nextInt();
				
				if(deleteId<=0)
				{
					System.out.println("Invalid Id. Must be greater than 0.");
					break;
				}

				int deleteResult = dao.delete(deleteId);
				System.out.println(deleteResult + " Row deleted");
				break;

			case 4:

				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				
				if(id<=0)
				{
					System.out.println("Invalid Id. Must be greater than 0.");
					break;
				}
				
				Student singStudent = dao.getSingleStudent(id);
				System.out.println(singStudent);
				
				/*
				 * List<Student> students = dao.getAllStudents();
				 * 
				 * if (students.isEmpty()) { System.out.println("No students found."); } else {
				 * for (Student st : students) { System.out.println(st); } }
				 */
				break;

			case 5:
				List<Student> students = dao.getAllStudent();
				System.out.println("--------------");
				System.out.println(students);
				System.out.println("--------------");
				for (Student s: students)
				{
					System.out.println(s);
				}
				break;
			case 6:
				System.out.println("Exiting program...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}