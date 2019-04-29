package servlet;

public class LoginService {
	public static boolean isUserValid(String user,String password)
	{
		return user.equals("Richard") && password.equals("1234");
	}
}
