package com.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.entities.UserEntity;
import com.hibernate.repositories.UserRepository;

public class HibernateInsertMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Hibernate.xml");

		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");

		UserEntity us = new UserEntity();
		us.setFirstName("Ahmad");
		us.setLastName("Jamil");
		us.setAddress("1252 jps St");
		us.setCity("Fairfax");
		us.setState("VA");
		userRepository.save(us);

	}
}