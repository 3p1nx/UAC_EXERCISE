package main;

public class OAuthLogin implements ILogin {
	private String token;
	
	
	public OAuthLogin(String token) {
		super();
		this.token = token;
	}


	@Override
	public int authenticate(String username, String token) {
		if(this.token == token) {
			return 1;
		}else {
			return 0;
		}
	}

}
