class overloading{
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int b) {
		System.out.println(c+ " " + b);
	}

	
}
public class Sample {
	
	public static void main(String[] args) {
		overloading obj=new overloading();
		obj.disp('c');
		obj.disp('c', 15);
		
		// TODO Auto-generated method stub

	}

}
