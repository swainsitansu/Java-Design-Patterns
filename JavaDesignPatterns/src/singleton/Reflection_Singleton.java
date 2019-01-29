package singleton;

import java.lang.reflect.Constructor;

public class Reflection_Singleton {
	public enum GFG  
	{ 
	  INSTANCE; 
	} 
	private String name;

	public volatile static Reflection_Singleton INSTANCE =new Reflection_Singleton();

	private Reflection_Singleton() {
		this.name = "Sitansu";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Reflection_Singleton instance1 = Reflection_Singleton.INSTANCE;
		System.out.println(instance1.getName());

		Reflection_Singleton instance2 = null;

		try {
			Constructor[] constructors = Reflection_Singleton.class.getConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (Reflection_Singleton) constructor.newInstance(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());

	}

}
