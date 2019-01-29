package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Singleton implements Serializable{
	private static final long serialVersionUID = 1L;
	public static Serialization_Singleton instance = new Serialization_Singleton();

	private Serialization_Singleton() {

	}
	
	  // implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 

	public static void main(String[] args) {

		Serialization_Singleton instance1 = Serialization_Singleton.instance;

		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("D:\\Others\\text file\\mytest.txt"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("D:\\\\Others\\\\text file\\mytest.txt"));
			try {
				Serialization_Singleton instance2 = (Serialization_Singleton) in.readObject();
				in.close();

				System.out.println("instance1 hashCode:- " + instance1.hashCode());

				System.out.println("instance2 hashCode:- " + instance2.hashCode());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
