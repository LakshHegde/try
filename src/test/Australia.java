package test;

public class Australia implements Centraltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Australia a = new Australia();// object for classs
		Centraltraffic at = new Australia(); // object for inerface
		at.redstop();
		at.yellowwait();at.greengo();
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Please Stop");
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Please go");
	}

	@Override
	public void yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("Please wait");
	}

	}


