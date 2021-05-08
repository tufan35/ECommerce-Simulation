package business.concretes;
import business.abstracts.UserService;
import core.LoginService;
import core.Utility;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private LoginService loginService;

	public UserManager(UserDao userDao, LoginService loginService) {
		this.userDao = userDao;
		this.loginService = loginService;
	}

	@Override
	public void register(User user) {

		if (user.getPassword().length() >= 6 && 
			user.getFirstname().length() >= 2 && 
			user.getLastname().length() >= 2 && 
			emailcheck(user) && 
			Utility.validateEmail(user.getEposta())) {

			userDao.register(user);
			System.out.println("�yeli�i tamamlamak i�in email adresinize g�nderilen do�rulama linkine t�klay�n�z ! ");

			Utility.sendActivationEmail(user.getEposta());

		} else {

			System.out.println(" L�tfen bilgilerinizi kontrol ediniz. ");
		}

	}

	@Override
	public Boolean emailcheck(User user) {
		
		System.out.println("Email kontrol� sa�land�.");
		return true;  //email konrol�nde false �ekilcektir.
	}

	@Override
	public void confirmactivate(User user) {
	
			System.out.println("Email do�rulanm��t�r.");
			user.setEmailactive(true);
		
	}

	@Override
	public void login(String message) {
		System.out.println(message + " Servisi ile sisteme giri� yap�lm��t�r. ");
	}

}
