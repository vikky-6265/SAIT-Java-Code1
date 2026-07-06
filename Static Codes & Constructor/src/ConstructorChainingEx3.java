class A1{
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	A1(String a,int b){ 
		this();
		System.out.println("Hello A");
		x=a;
		y=b;
	}
	A1(String a){
		this("KK",80);
		System.out.println("Ok A");
		x=a;
	}
	A1(){
		System.out.println("Hi A");
	}
}
public class ConstructorChainingEx3 {
	public static void main(String[] args) {
		A1 a=new A1("GG");
		a.show();
	}
}