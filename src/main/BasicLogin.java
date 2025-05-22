package main;

public class BasicLogin implements ILogin {
	private String name;
	private String pass;
	
	public BasicLogin(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	@Override
	public int authenticate(String username, String pass) {
		if(username == name && this.pass == pass) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}
