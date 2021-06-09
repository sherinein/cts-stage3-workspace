package com.cts.hibernate;

import com.cts.hibernate.dao.StudentDao;
import com.cts.hibernate.dao.StudentDaoImpl;
import com.cts.hibernate.entity.StudentEntity;

/**
 * Hello world!
 *
 */
public class Main 
{
	private static StudentDao dao;
	public Main() {
		dao=new StudentDaoImpl();
	}
    public static void main( String[] args )
    {
       StudentEntity student1=new StudentEntity(1,"Janani","CSE","janani@gmail.com",9947545746L);
    	StudentEntity student2=new StudentEntity(2,"Aditya","CSE","aditya@gmail.com",9947767846L);
    	StudentEntity student3=new StudentEntity(3,"Harshini","CSE","harshini@gmail.com",9952545746L);
    	StudentEntity student4=new StudentEntity(4,"Janani","CSE","janani@gmail.com",9947545746L);
       Main main=new Main();
       dao.saveStudent(student3);
    }
}
