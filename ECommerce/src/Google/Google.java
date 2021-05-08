package Google;

import core.LoginService;

public class Google implements LoginService {

	@Override
	public void login(String message) {

		System.out.println(" Google ile login olundu. ");
	}

}
