package singleton;

public class Eager_Singleton {
	private String name;

	public static Eager_Singleton obj=new Eager_Singleton();

	private Eager_Singleton() {
		this.name = "Sitansu";
	}

	public static  Eager_Singleton getInstance() {
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
