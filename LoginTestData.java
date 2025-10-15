package week3.day2;

public class LoginTestData extends TestDataClassRoom1{

	public void enterUsername(String user) {
		
		System.out.println("This is Enter UserName : "  + user);

	}
	
	private void enterPassword(String pwd) {
		System.out.println("This is Enter Password : "  + pwd);

	}
	public static void main(String[] args) {
		
		LoginTestData objnew = new LoginTestData();

		objnew.enterCredentials();
		objnew.navigateToHomePage();
		objnew.enterPassword("Student");
		objnew.enterUsername("Test@1234");

	}

}
