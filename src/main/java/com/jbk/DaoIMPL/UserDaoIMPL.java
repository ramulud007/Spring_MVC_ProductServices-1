package com.jbk.DaoIMPL;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jbk.Dao.UserDao;
import com.jbk.Entity.User;

@Repository
public class UserDaoIMPL implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Boolean addUser(User user) {

		Session session = null;
		Boolean isAdded = false;

		try {

			session = sessionFactory.openSession();
			session.save(user);
			session.beginTransaction().commit();

			isAdded = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return isAdded;
	}

	@Override
	public Boolean updateUser(User user) {

		Session session = null;
		Boolean isUpdate = false;

		try {
			session = sessionFactory.openSession();
			session.update(user);
			session.beginTransaction().commit();
			isUpdate = true;

		} catch (PersistenceException e) {
			isUpdate = false;

		} catch (Exception e) {
			isUpdate = false;
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return isUpdate;
	}

	@Override
	public User getUserById(String username) {

		Session session = null;
		User user=null;
		try {
			session = sessionFactory.openSession();
			user = session.get(User.class, username);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Session session = null;
		List<User> list = null;
		
		try {

			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(User.class);
			list = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public Boolean deleteUserById(String username) {

		Session session = null;
		Boolean isDeleted = false;

		try {

			session = sessionFactory.openSession();
			User user = session.get(User.class, username);
			session.delete(user);
			session.beginTransaction().commit();
			isDeleted = true;
			
		} catch (Exception e) {
			isDeleted = false;
		} finally {
			session.close();
		}

		return isDeleted;
	}

}
