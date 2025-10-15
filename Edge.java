package week3.day2;

public class Edge extends Chrome{

	public void takeSnap() {
		System.out.println("Take Snap method from Edge Class");

	}
	
	public void clearCookies() {
		System.out.println("Clear Cookies method from Edge Cass");

	}
	public static void main(String[] args) {
		
		Edge edg = new Edge();
		edg.takeSnap();
		edg.clearCookies();
		edg.navigateBack();
		edg.openIncognito();
		edg.clearCache();
		edg.clearCookies();
		edg.closeBrowser();
		edg.openURL();


	}

}
