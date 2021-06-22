package com.cts.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.hibernate.entity.Department;
import com.cts.hibernate.entity.Student;
import com.cts.hibernate.service.DepartmentService;
import com.cts.hibernate.service.DepartmentServiceImpl;
import com.cts.hibernate.service.StudentService;
import com.cts.hibernate.service.StudentServiceImpl;

@SpringBootApplication
public class AssociationUnidirectionalOnetomanyApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AssociationUnidirectionalOnetomanyApplication.class, args);
		
		DepartmentService service1=context.getBean(DepartmentServiceImpl.class);
		//StudentService service2=context.getBean(StudentServiceImpl.class);
		Department department=new Department();
		department.setDepartmentName("Computer Science");
		Student student1=new Student();
		student1.setStudentName("Nirmala");
		student1.setDepartment(department);
		Student student2=new Student();
		student2.setStudentName("Ramya");
		student2.setDepartment(department);
		/*
		 * List<Student> listOfStudents=new ArrayList<Student>();
		 * listOfStudents.add(student1); listOfStudents.add(student2);
		 */
	//	department.setStudent(listOfStudents);
	//	service2.save(student1);	
		service1.save(department);
		//service2.save(student1);
	//	service2.save(student2);
	
	}

}
