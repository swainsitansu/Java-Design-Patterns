package singleton;

public class Cloning_Singloton extends SuperClass {

	public static Cloning_Singloton instance = new Cloning_Singloton();

	private Cloning_Singloton() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) {
		Cloning_Singloton instance = Cloning_Singloton.instance;
		try {
			Cloning_Singloton instance2 = (Cloning_Singloton) instance.clone();
			System.out.println("instance1 hashCode:- " + instance.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
