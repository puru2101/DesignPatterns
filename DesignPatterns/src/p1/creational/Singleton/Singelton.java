package p1.creational.Singleton;

public class Singelton {

	private static Singelton singelton;

	private Singelton() {
	}

	private static Singelton getSinglton() {
		if (singelton == null) {
			singelton = new Singelton();
		}
		return singelton;
	}

	public static void main(String[] args) {
       Singelton singelton1= getSinglton();
       Singelton singelton2= getSinglton();
       System.out.println(singelton1==singelton2);

	}

}
