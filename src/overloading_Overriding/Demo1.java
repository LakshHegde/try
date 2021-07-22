package overloading_Overriding;

public class Demo1 extends Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.data();
	}

	public void data() {
		System.out.println("data"); //overriding
	}
}
