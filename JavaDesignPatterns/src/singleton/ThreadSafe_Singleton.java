package singleton;

public class ThreadSafe_Singleton {
	private String name;

	public static ThreadSafe_Singleton obj;

	private ThreadSafe_Singleton() {
		this.name = "Sitansu";
	}

	public static synchronized ThreadSafe_Singleton getInstance() {
		if (obj == null) {
			obj = new ThreadSafe_Singleton();

		}
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
