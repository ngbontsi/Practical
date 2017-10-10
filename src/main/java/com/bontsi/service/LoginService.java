package com.bontsi.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bontsi.models.User;
import com.bontsi.utilities.HibernateUtil;

public class LoginService {

	public boolean authenticateUser(String userId, String password) {
		final User user = getUserByUserId(userId);
		if(user!=null && user.getUserId().equals(userId) && user.getPassword().equals(password))
			return true;
		else
			return false;
	}

	public List<User> getListOfUsers(){
		List<User> list = new ArrayList<User>();
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from User").list();
			tx.commit();
		} catch (final Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public User getUserByUserId(String userId) {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		User user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			final Query query = session.createQuery("from User where userId='"+userId+"'");
			user = (User)query.uniqueResult();
			tx.commit();
		} catch (final Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

}
