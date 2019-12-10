package com.hibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entities.UserEntity;

public class UserRepository {

	private SessionFactory sessionfactory;

	public void save(UserEntity user) {

		Session session = sessionfactory.openSession();
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

}
