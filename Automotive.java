package week3.day2;

public class Automotive {

	//horn, steering, break, clutch , accelator
	
	public void horn() {
		System.out.println("Horn");
	}
	
	public void steering() {
		System.out.println("Steering");
	}
	
	public void clutch() {
		System.out.println("Clutch");
	}
	
	public void breaks() {
		System.out.println("Drum Break");

	}
	public static void main(String[] args) {

		//Create an object for this class to access the methods in main method 
		
		Automotive obj = new Automotive();
		obj.horn();
		obj.steering();
		obj.clutch();

	}

}
