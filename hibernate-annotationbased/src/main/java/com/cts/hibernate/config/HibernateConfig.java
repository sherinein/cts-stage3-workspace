package com.cts.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;

public class HibernateConfig {
	public static Logger logger=Logger.getLogger(HibernateConfig.class);
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		logger.info("session factory object is created");
		return sf;
	}
}
