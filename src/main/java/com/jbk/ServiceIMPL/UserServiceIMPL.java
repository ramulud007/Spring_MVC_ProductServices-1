package com.jbk.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.UserDao;
import com.jbk.Entity.User;
import com.jbk.Service.UserService;

@Service
public class UserServiceIMPL implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public Boolean addUser(User user) {
		
		return userDao.addUser(user);

	}

	@Override
	public Boolean updateUser(User user) {
		
		return userDao.updateUser(user);
	}

	@Override
	public User getUserById(String username) {
		
		return userDao.getUserById(username);
	}

	@Override
	public List<User> getAllUsers() {
		
		 return userDao.getAllUsers();	
		 
		
	}

	@Override
	public Boolean deleteUserById(String username) {
		
		return userDao.deleteUserById(username);
	}

	
}
