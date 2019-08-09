package singleton_design;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello Word!");
		
		
		 LazyInnerclassSingleton obj1 =   LazyInnerclassSingleton.getInstance();
		System.out.println(obj1.hashCode());
		 LazyInnerclassSingleton obj2 = LazyInnerclassSingleton.getInstance();
		System.out.println(obj2.hashCode());

	}

}
