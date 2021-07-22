package test;

public class Reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="madam";
String b="";

System.out.println(a.length());
for(int i=a.length()-1;i>=0;i--) {
	System.out.println(a.charAt(i));
	b=b+a.charAt(i); //+ is used for concatination
	
}
System.out.println(b); 
System.out.println(a);
if(b.equals(a)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
	
}
	}

}
