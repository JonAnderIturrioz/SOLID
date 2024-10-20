package interfacesegregationprinciple;

public class GmailAccount extends EmailSender{
	String name, emailAddress;
	
	public GmailAccount(String name,String emailAddress) {
		this.name=name;
		this.emailAddress=emailAddress;
	}
}
