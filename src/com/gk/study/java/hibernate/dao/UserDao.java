/**
 * 
 */
package com.gk.study.java.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gk.study.java.hibernate.model.User;

/**
 * @author gopi
 *
 */
@Repository
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {

		Session session = getSessionFactory().openSession();
		List<User> userList = new ArrayList<User>();
		Query query;

		try {
			session.beginTransaction();
			query = session.createQuery("from User");
			userList = (List<User>) query.list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return userList;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public void addUser(User user) {

		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("Hibernate Session Close");
		}
	}

}
