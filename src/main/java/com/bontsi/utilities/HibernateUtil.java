package com.bontsi.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try{
			final Configuration configuration=	new Configuration().configure();
			final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			return configuration.buildSessionFactory(serviceRegistry);


		}catch (final Throwable e) {
			System.out.println("Session creation failed. "+ e);
			throw new ExceptionInInitializerError(e);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutdown(){
		getSessionFactory().close();
	}

}
