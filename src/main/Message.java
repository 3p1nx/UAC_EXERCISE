package main;

public abstract class Message {
	protected ILogin login;
	protected String sender;
	protected String recipient;
	protected String content;
	
	public Message(ILogin login, String sender, String recipient, String content) {
		super();
		this.login = login;
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
	}

	protected abstract void send(String name, String pass);
	
}
