package opencloseprinciple;

public class TwitterService implements SignInService{

	@Override
	public boolean signIn(String log, String pass) {
		System.out.println("Signed in with Twitter. \n");
		return true;
	}

}
