package interfacesegregationprinciple;

public class Main {

	public static void main(String[] args) {
		
		GmailAccount gmail = new GmailAccount("Car Insurance Company", "carinsurance210@gmail.com");
		
		String name = "Jon Ander";
		String address = "Altzoko Zubi azpie";
		String emailAddress = "jiturrioz08@gmail.com";
		String telephone = "987654321";
	
		EmailContact contact = new Contact(name, address, emailAddress, telephone);
		
		
		String message = "Hello, we've been trying to reach you about your car's extended warranty.";
		
		gmail.sendEmail(contact, message);

	}

}
