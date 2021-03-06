package com.cts.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.hibernate.config.HibernateConfig;
import com.cts.hibernate.entity.StudentEntity;

public class CreateQuery {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateConfig.getSessionFactory();
		Session session=sf.openSession();
		System.out.println("session object is created");
		Query<StudentEntity> query=session.createQuery("from StudentEntity");
		//query.setFetchSize(2);
		//System.out.println(n);
		List<StudentEntity> listOfStudent=query.list();
		Iterator<StudentEntity> iterator=listOfStudent.iterator();
		while(iterator.hasNext()) {
			StudentEntity student=(StudentEntity)iterator.next();
			System.out.println(student.getStudentName());
		}
		
	}

}
