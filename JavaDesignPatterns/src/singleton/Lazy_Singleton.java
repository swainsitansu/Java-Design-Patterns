package singleton;

public class Lazy_Singleton {
	private String name;

	public static Lazy_Singleton obj;

	private Lazy_Singleton() {
		this.name = "Sitansu";
	}

	public static Lazy_Singleton getInstance() {
		if (obj == null) {
			obj = new Lazy_Singleton();

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
