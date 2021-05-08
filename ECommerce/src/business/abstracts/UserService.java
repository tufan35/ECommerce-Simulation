package business.abstracts;



import entities.concrete.User;

	public interface UserService {
	
	void register(User user);
	Boolean  emailcheck(User user);
	public void confirmactivate(User user );
	public void login(String message);
	
	
	
}
