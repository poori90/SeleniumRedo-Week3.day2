package week3.day2;

public class Chrome extends Browser{

	
	public  void openIncognito() {
		
		System.out.println("This is Incognito Browser ");
	}
	public void clearCache() {
		System.out.println("This method is to clear Cache ");

	}
	public static void main(String[] args) {
		
		Chrome chr = new Chrome();
		chr.navigateBack();
		chr.closeBrowser();
		chr.clearCache();
		chr.openIncognito();
		chr.openURL();
	}

}
