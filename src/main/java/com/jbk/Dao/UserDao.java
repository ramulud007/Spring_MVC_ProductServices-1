package com.jbk.Dao;


import java.util.List;

import com.jbk.Entity.User;

public interface UserDao {

	public Boolean addUser(User user);
	public Boolean updateUser(User user);
	public User getUserById(String username);
	public List<User> getAllUsers();
	public Boolean deleteUserById(String username);
	
}
