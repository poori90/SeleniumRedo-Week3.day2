package week3.day2;

public class LoginPageSubClass extends BasePageSuperClass{

	@Override
	public void performCommonTasks(String logintask) {
		System.out.println("This is the Override performCommonTasks Method from  BasePage Super Class extended to Login Page Sub Class " + logintask);

	}
	public static void main(String[] args) {
		
		LoginPageSubClass lp = new LoginPageSubClass();
		lp.performCommonTasks("LoginSuccessfull");
		
		BasePageSuperClass bp = new BasePageSuperClass();
		bp.performCommonTasks(" BaseClassCommontask");
	}

}
