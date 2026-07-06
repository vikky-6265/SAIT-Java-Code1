class A4{
	int x=90;
	void m() {
		System.out.println("Hello A");
	}
}
public class ArrayEx8 {
	public static void main(String[] args) {
		//Normal way of creating objects
//		A a=new A();
//		A b=new A();
//		A c=new A();
//		A d=new A();
		
		//creating objects via Array
		A4 a[]=new A4[4];
		a[0]=new A4();
		a[1]=new A4();
		a[2]=new A4();
		a[3]=new A4();
		//or
		A4 aa[]={new A4(), new A4(), new A4(), new A4()};
		//or
		A4 aaa[]=new A4[4];
		for(int i=0;i<aaa.length;i++) {
			aaa[i]=new A4();
		}
		
		//accessing one of the object
		aaa[2].m();
		aaa[2].x=900000;
		System.out.println(aaa[2].x);
		
		for(A4 k:aaa) {
			System.out.println(k.x);
		}
	}
}