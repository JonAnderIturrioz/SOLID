package interfacesegregationprinciple;

public abstract class EmailSender {
	public void sendEmail(EmailContact c, String message){
		//Env�a un mensaje a la direcci�n de correo electr�nico del Contacto c.
		System.out.println("Sent "+message+" to "+ c.getEmailAddress());
	}
}
