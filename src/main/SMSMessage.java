package main;

public class SMSMessage extends Message {
	
	 public SMSMessage(ILogin login, String sender, String recipient, String content) {
	        super(login, sender, recipient, content);
	 }
	 
	 public void send(String name, String password) {
		 Credential credential = new Credential(name, password);
			if(login.authenticate(credential) == 1) {
				System.out.println("SMS sent from " +sender +" to "+recipient+": "+ content);
			}else {
				System.out.println("Email authentication failed for user: "+ name);
			}
		}
}
