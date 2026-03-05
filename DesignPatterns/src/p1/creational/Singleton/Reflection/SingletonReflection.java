package p1.creational.Singleton.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {
	private static SingletonReflection singletonReflection;

	private SingletonReflection() {
		if (singletonReflection != null) {
			throw new RuntimeException("Already created");
		}
	}

	public static SingletonReflection getSingletonReflection() {

		if (singletonReflection == null) {
			singletonReflection = new SingletonReflection();
		}
		return singletonReflection;

	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonReflection s1 = getSingletonReflection();
		Constructor<SingletonReflection> s2 = SingletonReflection.class.getDeclaredConstructor();
		s2.setAccessible(true);
		SingletonReflection s3 = s2.newInstance();
		System.out.println(s1 == s3);
	}

}
