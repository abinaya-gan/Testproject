class ABC{
	public void disp()
	{
		System.out.println("Parent class");
	}
	
}
public class Demo extends ABC {
	public void disp()
	{
		System.out.println("child class");
	}
	public void mymethod()
	{
		System.out.println("new child class");
	}

	public static void main(String[] args) {
		ABC obj = new Demo();
		obj.disp();
		ABC obj1 = new ABC();
		obj1.disp();
		// TODO Auto-generated method stub

	}

}
