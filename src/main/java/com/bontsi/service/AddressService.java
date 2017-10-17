package com.bontsi.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bontsi.models.Address;
import com.bontsi.models.User;
import com.bontsi.utilities.HibernateUtil;

public class AddressService {

	public User getUserByUserId(String uid) {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		User user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			final Query query = session.createQuery("from address where uid='"+uid+"'");
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

	public void update(Address address) {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(address);
			tx.commit();
		} catch (final Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
