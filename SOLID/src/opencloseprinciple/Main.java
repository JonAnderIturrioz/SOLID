package opencloseprinciple;

public class Main {

	public static void main(String[] args) {
		
		AuthService auth = new AuthService();
		SignInService service;
		
		String login = "jonander";
		String pass = "pass";
		
		service = new FacebookService();
		auth.signIn(service, login, pass);
		
		service = new TwitterService();
		auth.signIn(service, login, pass);
		
		service = new GoogleService();
		auth.signIn(service, login, pass);
		
		service = new AppleService();
		auth.signIn(service, login, pass);

	}

}
