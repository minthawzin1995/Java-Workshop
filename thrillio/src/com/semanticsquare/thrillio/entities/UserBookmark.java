package com.semanticsquare.thrillio.entities;

public class UserBookmark {
	
	//Variables
	private User user;
	private Bookmark bookmark;
	
	//getter and setter methods
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bookmark getBookmark() {
		return bookmark;
	}
	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}
	@Override
	public String toString() {
		return "UserBookmark [user=" + user + ", bookmark=" + bookmark + "]";
	}
}
