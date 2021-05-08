package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		
		System.out.println(user.getFirstname() + " kullanıcı başarıyla kaydolmuştur.");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
