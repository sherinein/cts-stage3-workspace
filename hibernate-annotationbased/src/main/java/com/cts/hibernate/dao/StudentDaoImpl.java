package com.cts.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.cts.hibernate.config.HibernateConfig;
import com.cts.hibernate.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	public  Logger logger=Logger.getLogger(StudentDaoImpl.class);
	private Transaction transaction;
	@Override
	public void saveStudent(StudentEntity student) {
	
		try(Session session=HibernateConfig.getSessionFactory().openSession()){
			logger.info("session object is created"+ session);
			
			transaction=session.beginTransaction();
			logger.info("transaction is created"+transaction);
			session.save(student);
			transaction.commit();
		}catch(Exception e) {
			if(transaction!=null) {
				logger.info("Transaction is rollbacked");
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		
		
	}

	
}
