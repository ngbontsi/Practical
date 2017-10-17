package com.bontsi.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bontsi.models.Branch;
import com.bontsi.utilities.HibernateUtil;

public class BranchService {

	public Branch getBranchByUId(long uid) {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Branch branch = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			final Query query = session.createQuery("from branch where uid="+uid);
			branch = (Branch)query.uniqueResult();
			tx.commit();
		} catch (final Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return branch;
	}

	public void update(Branch branch) {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(branch);
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
