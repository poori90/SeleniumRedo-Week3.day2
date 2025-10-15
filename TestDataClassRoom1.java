package week3.day2;

public class TestDataClassRoom1 {

	
	public void enterCredentials() {


		System.out.println("This is Enter Credetnials method ");

	}
	public void navigateToHomePage() {
		System.out.println("This is Navigate to Home Page Method ");

	}
	public static void main(String[] args) {
		
		TestDataClassRoom1 obj = new TestDataClassRoom1();
		obj.navigateToHomePage();
		obj.enterCredentials();

	}

}
