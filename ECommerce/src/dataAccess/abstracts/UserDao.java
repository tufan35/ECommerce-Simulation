package dataAccess.abstracts;

import java.util.List;

import entities.concrete.User;

public interface UserDao {
	
	void register(User user);
	
	List<User> getAll();
	

}
