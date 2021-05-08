import business.abstracts.UserService;
import business.concretes.UserManager;
import core.EmailPasswordManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concrete.User;

public class Main {

	public static void main(String[] args) {
			
		
		UserService userService  = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		
		
		User userone = new User(1, "TUFAN", "CEVÝK", "tufan@gmail.com", "1234567", false);
		userService.register(userone);
		

	}

}
