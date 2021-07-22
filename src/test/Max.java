package test;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,5,3,8,9,0,3,5}; int max=a[0];
 for (int i=0;i<a.length;i++) {
	 if(a[i]>max) {
		 max=a[i];
		
	 } 
 }System.out.println(max);
	}

}
