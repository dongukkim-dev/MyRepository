
public class A {
	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Change in master branch");
		System.out.println("Change in devB branch");
		B b = new B();
		b.sayB();
		
		System.out.println("Change in devC branch");
		C c = new C();
		c.sayC();
	}
}
