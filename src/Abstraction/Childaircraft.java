package Abstraction;

public class Childaircraft extends Parentaircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childaircraft c= new Childaircraft();
		c.safetyguidelines();
		c.engine();
		c.bodycolor();
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("body clr");
	}

}
