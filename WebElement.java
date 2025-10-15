package week3.day2;

public class WebElement {
	
	public void click() {
		System.out.println("This is the Click method in WebElement class ");

	}
	public void setText(String text) {
		System.out.println("This is the Text method in WebElement : " + text  );
	}
	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		we.setText("Inheritance");
		

	}

}
