package com.jbk.DaoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Dao.AuthDao;
import com.jbk.Entity.User;




@Repository
public class AuthDaoIMPL implements AuthDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(String username) {
		
		Session session = sessionFactory.openSession();
		User user = session.get(User.class, username);
		return user;
	}

	

	




}
