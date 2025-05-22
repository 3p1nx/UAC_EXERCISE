package main;

public class EmailMessage extends Message {
	public EmailMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}
	
	public void send(String name, String password) {
		if(login.authenticate(name, password) == 1) {
			System.out.println("Email sent from " +sender +" to "+recipient+": "+ content);
		}else {
			System.out.println("Email authentication failed for user: "+ name);
		}
	}
}
