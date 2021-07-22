package constructor;

public class Variables {

	static String name;
	String area;
	String city;
	

	public Variables() {
		
		//System.out.println(name);
	}
	
	public Variables(String name, String area, String city) {
		this.name=name;
		this.city=city;
		this.area=area;
		
		/*System.out.println(name);
		System.out.println(area);
		System.out.println(city);*/
	}
	
	public void getname() {
	
		System.out.println(name);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v=new Variables();
		Variables v1=new Variables("laksh","vinobnaagr","shimoga");
		Variables v2=new Variables("laksh1","vinobnaagr1","shimoga1");
		Variables v3=new Variables("laksh2","vinobnaagr1","shimoga1");
		//v2.getname();
		v1.getname(); 
		//v3.getname(); 
	
	System.out.println(name);  //as variable is made as static laksh1 will be printed.
	}

	

}
