package week3.day2;

import net.bytebuddy.pool.TypePool.Default.ReaderMode;

public class Safari extends Edge {

	
	public void readerMode() {
		System.out.println("This is readerMode method from Safari class ");

	}
	public void fullScreenMode() {
		System.out.println("This is FullScreenMode method from Safari method ");

	}
	public static void main(String[] args) {

		Safari saf = new Safari();
		saf.readerMode();
		saf.fullScreenMode();
		saf.clearCache();
		saf.clearCookies();
		saf.closeBrowser();
		saf.takeSnap();
		saf.openURL();
		saf.readerMode();
		saf.navigateBack();
		saf.openIncognito();
		saf.browserDetails("Chrome", 4);
		saf.browserDetails("Edge" , 6, "Windows11");

	}

}
