package interfacesegregationprinciple;

public abstract class EmailSender {
	public void sendEmail(EmailContact c, String message){
		//Envía un mensaje a la dirección de correo electrónico del Contacto c.
		System.out.println("Sent "+message+" to "+ c.getEmailAddress());
	}
}
