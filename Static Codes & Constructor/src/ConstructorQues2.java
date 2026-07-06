class A2{
	String x;
	static int y;
	void show() {
		System.out.println(x+" "+y);
	}
	A2(){
		System.out.println("Hello AA");
		x="Ram";
		y++;
	}
	static {
		System.out.println("Hi AA");
	}
} 
public class ConstructorQues2 {
	public static void main(String[] args) {
		System.out.println(A2.y);
		A2 a1=new A2();
		A2 a2=new A2();
		a1.show();
		a2.show();
	}
}