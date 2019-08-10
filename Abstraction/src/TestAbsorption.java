abstract class Bike
{   Bike()
	{System.out.println("Bike is created");}
	abstract void run();
	void changegear() {
		System.out.println("gear changed successfully");
	}
	
}
class Honda extends Bike{
	void run()
	{
		System.out.println("running successfully");
	}
}
public class TestAbsorption {

	public static void main(String[] args) {
		Bike obj= new Honda();
		obj.run();
		obj.changegear();
		

	}

}
