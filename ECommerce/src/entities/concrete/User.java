package entities.concrete;

import entities.abstracts.Entity;

public class User implements Entity{
	
	int id;
	private String firstname;
	private String lastname;
	private String eposta;
	private String password;
	private Boolean emailactive;
	
	public User(int id, String firstname, String lastname, String eposta, String password, Boolean emailactive) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.eposta = eposta;
		this.password = password;
		this.emailactive = emailactive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEmailactive() {
		return emailactive;
	}

	public void setEmailactive(Boolean emailactive) {
		this.emailactive = emailactive;
	}
	
	

}
