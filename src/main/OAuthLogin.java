package main;

public class OAuthLogin implements ILogin {
	private String token;
	
	
	public OAuthLogin(String token) {
		super();
		this.token = token;
	}

	@Override
	public int authenticate(Credential credential) {
		if(this.token == credential.key) {
			return 1;
		}else {
			return 0;
		}
	}

}
