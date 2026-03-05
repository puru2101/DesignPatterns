package p1.creational.Singleton.clone;

public class SingletonClone implements Cloneable {

	private static SingletonClone singletonClone;

	private SingletonClone() {
	}
	

	private static SingletonClone getSingletonClone() {
		if (singletonClone == null) {
			singletonClone = new SingletonClone();
		}
		return singletonClone;
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { return
	 * new CloneNotSupportedException(); }
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonClone s1 = getSingletonClone();
		SingletonClone s2 = (SingletonClone) getSingletonClone().clone();
		System.out.println(s1 == s2);

	}

}
