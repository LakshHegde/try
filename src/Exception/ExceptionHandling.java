package Exception;

public class ExceptionHandling {
	public void getdata() {
		int a=10;int b=2; int c=0;
		//int k=a/b;
		//System.out.println(k);
		try{
			int a1[]=new int[5];
			System.out.println(a1[1]);
			String arr[]= {"a","b"};
			System.out.println(arr[1]);
			int j=b/c;

			
			System.out.println(j);
		}catch(Exception e) {
		System.out.println("sorry");
		}
	}
	
//System.out.println();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling e= new ExceptionHandling();
		//int a=10;int b=2; int c=0;
		//int k=a/b;
e.getdata();
		//System.out.println(k);
	}

}
