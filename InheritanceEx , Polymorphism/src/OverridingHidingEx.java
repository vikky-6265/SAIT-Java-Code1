class A3{
	void m1() {
		System.out.println("Hello A");
	}
	void xyz() {
		System.out.println("Vikky");
	}
}
class B2 extends A3{
	void m1() {  //Method overriding
		System.out.println("Hello B");
	}
}
public class OverridingHidingEx {
	public static void main(String[] args) {
		B2 b=new B2();
		b.m1();
		b.xyz();
	}
}