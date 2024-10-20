package opencloseprinciple;

public class AppleService implements SignInService{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Signed in with Apple. \n");
		return true;
	}

}
