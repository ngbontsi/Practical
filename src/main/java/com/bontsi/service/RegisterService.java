package com.bontsi.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bontsi.models.User;
import com.bontsi.utilities.HibernateUtil;

public class RegisterService {

	public boolean isUserExists(User user){
		final Session session = HibernateUtil.getSessionFactory().openSession();
		boolean result = false;
		Transaction tx = null;
		try{
			tx = session.getTransaction();
			tx.begin();
			final Query query = session.createQuery("from User where userId='"+user.getUserId()+"'");
			final User u = (User)query.uniqueResult();
			tx.commit();
			if(u!=null) result = true;
		}catch(final Exception ex){
			if(tx!=null)
				tx.rollback();
		}finally{
			session.close();
		}
		return result;
	}

	public boolean register(User user){
		final Session session = HibernateUtil.getSessionFactory().openSession();
		boolean result = false;
		if(isUserExists(user)) return result;

		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(user);
			tx.commit();
			result = true;
		} catch (final Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

}
