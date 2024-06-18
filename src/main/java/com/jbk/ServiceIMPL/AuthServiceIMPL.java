package com.jbk.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jbk.Dao.AuthDao;
import com.jbk.Entity.User;
import com.jbk.Service.AuthService;


@Service
public class AuthServiceIMPL implements AuthService {

	@Autowired
	private AuthDao dao;
	
	@Override
	public User addUserPage(String username, String password) {
	User user = dao.getUser(username);
		
	if(user!=null) {
		
		if(password.equals(user.getPassword())) {
			return user;
		}
		else {
			return null;
		}
	}
	else {
		return null;
	}
	
	}

	

}
