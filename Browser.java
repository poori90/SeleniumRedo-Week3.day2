package week3.day2;

public class Browser {
	
	//Method Overloading
	//inside the same class ,same method name with different arguments and change in count of arguments

	public void browserDetails(String browserName, int browserVersion) {
		
		System.out.println(browserName + " " + browserVersion);
	}
	public void browserDetails(String browserName, int browserVersion , String supportOPS) {
		
		System.out.println(browserName + " " + browserVersion + " " +supportOPS );
	}
	
	public void openURL() {
		
		System.out.println("This is the URL to load in the Browser ");

	}
	public void closeBrowser() {
		System.out.println("This is the method to close the Browser");

	}
	public void navigateBack() {
		System.out.println("This is the method to navigate Back");

	}
	public static void main(String[] args) {
		
		Browser browser = new Browser();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();

		
	}

}
