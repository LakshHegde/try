package overloading_Overriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.data();
		d.data("a");
	}

	public void data() {
	System.out.println("data1");
	}
	

	public void data(String a) {
		System.out.println("data2"); // overloading
	}
	
	
	
	
	
}
