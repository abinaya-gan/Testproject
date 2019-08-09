class ABC{
	public void disp() {
		System.out.println("overridden method");
		}
	}
public class RuntimePolymorphism extends ABC{
	
	public void disp() {
		System.out.println("overridding method");
		}

	public static void main(String[] args) {
		ABC obj = new RuntimePolymorphism();
		obj.disp();
		// TODO Auto-generated method stub

	}

}
