
public class TryCatch {

	public static void main(String[] args) {
		
		
			 try {
				 try {
					 
				 System.out.println("original");
					 int a=45/0;
					 System.out.println(a);
				 }
				 catch(ArrayIndexOutOfBoundsException e) {
					 System.out.println("Exception:e");
				 
					 
				 }
				 
				 System.out.println("wrong");
				try {
					System.out.println("Duplicate");
					int a=45/0;
					System.out.println(a);
				}
				catch(ArrayIndexOutOfBoundsException e1) {
					System.out.println("Exception :e1");
				}
				System.out.println("Index value");
			 }
				catch(ArithmeticException e2) {
					System.out.println("Exception:e2");
				}
				catch(ArrayIndexOutOfBoundsException e3) {
					System.out.println("Exception:e3");
			
				}
			
			 }
			 
}
		 