package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillo.DataStore;

public class UserDao {
	
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
