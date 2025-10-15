package week3.day2;

public class BMW extends Car {

	public void nameOfTheCar() {
		System.out.println("BMW-520D");

	}
	
	public void logoOfCar() {
		System.out.println(" BMW ");
	}
	@Override
	public void breaks() {
		System.out.println("ABS Break");
		super.breaks();
	}
	@Override
	public void designOfCar() {
		System.out.println("DESIGN NO : 879HKN-2025 ");
		super.designOfCar();
	}

	public static void main (String[] args) {
		
		BMW car1 = new BMW();
		car1.designOfCar();
		car1.clutch();
		car1.horn();
		car1.steering();
		car1.breaks();
		
	}
}
