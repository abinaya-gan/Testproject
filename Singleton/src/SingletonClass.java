
public class SingletonClass {
	 private static final SingletonClass instance;

	    /** Don't let anyone else instantiate this class */
	    private SingletonClass() {}

	    /** Create the one-and-only instance in a static block */
	    static {
	        try {
	            instance = new SingletonClass();
	        } catch (Exception ex) {
	            throw ex;
	        }
	    }

	    /** Provide a public method to get the instance that we created */
	    public static SingletonClass getInstance() {
	        return instance;
	    }

}
