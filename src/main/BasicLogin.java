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
	public int authenticate(Credential credential) {
		if(credential.name == name && credential.key == pass) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}
