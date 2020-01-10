package com.semanticsquare.thrillo;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class DataStore {

	private static final int USER_BOOKMARK_LIMIT = 5;

	private static final int BOOKMARK_COUNT_PER_TYPE = 5;

	private static final int BOOKMARK_TYPE_COUNT = 3;

	private static final int TOTAL_USER_COUNT = 5;

	//creating data structure to store user
	private static User[] users = new User[TOTAL_USER_COUNT];
	
	public static User[] getUsers() {
		return users;
	}

	//creating data structure for bookmarks
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPE_COUNT][BOOKMARK_COUNT_PER_TYPE];
	
	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	//for userBookMark
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
	
	//loading user method
	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}
	
	private static void loadUsers() {
		users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com" ,"test","John","M", Gender.MALE, UserType.USER);
		users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com" ,"test","Sam","M",	Gender.MALE, UserType.USER);
		users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "Anita", "M", Gender.MALE , UserType.EDITOR);
		users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com", "test", "Sara", "M", Gender.FEMALE , UserType.EDITOR);
		users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com" ,"test","Dheeru","M",	Gender.MALE, UserType.CHIEF_EDITOR);
	}
	
	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com");
		bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(2001,"How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",	"http://www.stackoverflow.com");
	}
	
	private static void loadMovies() {
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane", "", 1941, new String[]	{"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,8.5);
	}
	
	private static void loadBooks() {
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000,"Walden","",1854, "Wilder Publications", new String[] {"Henry David Thoreau"},	BookGenre.PHILOSOPHY,4.3);
	}
}
