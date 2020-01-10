package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	
	private static UserManager instance = new UserManager();
	
	//invoke Dao
	private static UserDao dao = new UserDao();
	
	
	//Singleton pattern for the initialization of the entities
	private UserManager() {}
	
	//return method
	public static UserManager getInstance() {
		return instance;
	}
	
	//create user method
	public User createUser(long id, String email, String password, String firstName, String lastName,
			int gender, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
