package opencloseprinciple;

public class GoogleService implements SignInService{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Signed in with Google. \n");
		return true;
	}

}
