package core;

public class EmailPasswordManager implements LoginService {

	@Override
	public void login(String message) {

		EmailPasswordManager emailPasswordManager = new EmailPasswordManager();
		emailPasswordManager.login("Email ile sisteme kayýt yapýlmýþtýr." );
	}

}
