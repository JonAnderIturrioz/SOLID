package opencloseprinciple;

public class FacebookService implements SignInService{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Signed in with Facebook. \n");
		return true;
	}

}
