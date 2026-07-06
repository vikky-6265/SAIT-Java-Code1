class Animal1{
	String name;
	int age;
	void show() {
		System.out.println(name+age);
	}
	Animal1(){
		name="Dog";
		age=10;
		System.out.println("Hello Animal");
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Animal1 a1=new Animal1();
		//a1.Animal();//error
		Animal1 a2=new Animal1();
		Animal1 a3=new Animal1();
		//Animal a4=new Animal("Cat",8);//error
		a1.show();
		a2.show();
		a3.show();
	}

}