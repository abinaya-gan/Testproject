package singleton_design;

public class LazyInnerclassSingleton {
	private LazyInnerclassSingleton() {}
	private static class singletonhelper{
		private static LazyInnerclassSingleton instance = new LazyInnerclassSingleton();
	}
	public static LazyInnerclassSingleton getInstance()
	{
		return singletonhelper.instance;
	}

}
