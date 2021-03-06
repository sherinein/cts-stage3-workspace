package com.cts.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.cts.hibernate.config.HibernateConfig;
import com.cts.hibernate.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	/* 1. Configuration object
	2. SessionFactory object
	3. Session object
	4. Trasaction Object 
		*/
	public  Logger logger=Logger.getLogger(StudentDaoImpl.class);
	private Transaction transaction;
	
	@Override
	public void saveStudent(StudentEntity student) {
	
		try(Session session=HibernateConfig.getSessionFactory().openSession()){
			logger.info("session object is created");
			
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
					
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
				logger.info("Transaction is rollbacked");
			}
			e.printStackTrace();
		}
		
		
	}

	
}
