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
       StudentEntity student2=new StudentEntity("Ram","CSE","ram@gmail.com",9947745746L);
       Main main=new Main();
       dao.saveStudent(student2);
    }
}
