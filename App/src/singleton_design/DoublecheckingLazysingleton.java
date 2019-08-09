package singleton_design;

public class DoublecheckingLazysingleton {
	private DoublecheckingLazysingleton () {}
	private static DoublecheckingLazysingleton instance;
	public static DoublecheckingLazysingleton getInstance()
	{
		if(instance==null)
		{
			synchronized (DoublecheckingLazysingleton.class) {
			
		
		if(instance==null)
		{
			return instance=new DoublecheckingLazysingleton(); 
		}
		
	}

}
		return instance;
	}
}