package com.bontsi.tests;

import org.hibernate.Session;

import com.bontsi.models.User;
import com.bontsi.utilities.HibernateUtil;

public class DatabaseTest {

	public static void main(String[] args) {
		final Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		final User user = new User();
		user.setFirstName("test");
		user.setLastName("test");
		user.setMiddleName("est");
		user.setPassword("hi");
		user.setUserId("ngbontsi");
		user.setEmail("bhla");
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		HibernateUtil.shutdown();


	}

}
