package singleton;

public class DoubleChecking_Singleton {
	private String name;

	public volatile static DoubleChecking_Singleton obj;

	private DoubleChecking_Singleton() {
		this.name = "Sitansu";
	}

	public static synchronized DoubleChecking_Singleton getInstance() {
		if (obj == null) {
			synchronized (DoubleChecking_Singleton.class) {
				if (obj == null) {
					obj = new DoubleChecking_Singleton();

				}
			}
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
