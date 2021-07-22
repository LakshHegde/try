package collectionsExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExample {
	public static void main(String[] args) { // TODO Auto-generated method stub
	/*ArrayList<String> a = new ArrayList<String>();	
	a.add("ravi");
	a.add("ravi1");
	a.add("ravvi2");
	System.out.println(a);
	a.add(1, "replaced ravi"); System.out.println(a);
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("ravinew");
	a.addAll(1, a1);
	System.out.println(a);
	System.out.println(a.contains("ravi1"));
	System.out.println(a.get(2));
	System.out.println(a.remove(1));
	System.out.println(a.remove("ravi"));*/
	
	HashSet<String> hs= new HashSet<String>();
	hs.add("boss");
	hs.add("boss1");
	hs.add("boss");  	hs.add("boss2"); 	hs.add("boss3"); hs.add("boss6"); hs.add("boss5"); hs.add("boss4");
	System.out.println(hs);
	hs.remove("boss2"); //hs.remove(hs);
	//System.out.println(hs);
	
	Iterator<String> i=hs.iterator();
	//i.hasNext()
	//i.next();//System.out.println(i.next());
	//System.out.println(i.next());
	
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
