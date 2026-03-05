package p1.creational.Singleton.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private static SingletonSerialization singletonSerialization;

	private SingletonSerialization() {

	}

	public static SingletonSerialization getSingletonSerialization() {
		if (singletonSerialization == null) {
			singletonSerialization = new SingletonSerialization();
		}
		return singletonSerialization;
	}
	
	protected Object readResolve() {
		return singletonSerialization;
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SingletonSerialization s1 = getSingletonSerialization();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
		oos.writeObject(s1);

		FileInputStream f1 = new FileInputStream("obj");
		ObjectInputStream os = new ObjectInputStream(f1);

		SingletonSerialization s2 = (SingletonSerialization) os.readObject();

		System.out.println(s1 == s2);

		oos.close();
		os.close();
	}

}
