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
			System.out.println("Üyeliði tamamlamak için email adresinize gönderilen doðrulama linkine týklayýnýz ! ");

			Utility.sendActivationEmail(user.getEposta());

		} else {

			System.out.println(" Lütfen bilgilerinizi kontrol ediniz. ");
		}

	}

	@Override
	public Boolean emailcheck(User user) {
		
		System.out.println("Email kontrolü saðlandý.");
		return true;  //email konrolünde false çekilcektir.
	}

	@Override
	public void confirmactivate(User user) {
	
			System.out.println("Email doðrulanmýþtýr.");
			user.setEmailactive(true);
		
	}

	@Override
	public void login(String message) {
		System.out.println(message + " Servisi ile sisteme giriþ yapýlmýþtýr. ");
	}

}
