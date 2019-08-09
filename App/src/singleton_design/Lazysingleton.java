package singleton_design;

public class Lazysingleton {

	
		private Lazysingleton() {
			
		}
		private static Lazysingleton instance ;
		public static synchronized Lazysingleton getInstance()
		{
			if(instance==null)
			{
			return instance = new Lazysingleton();
			
		}
			else
			{
				return instance;
			}
		

	}

}
