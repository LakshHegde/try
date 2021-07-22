package collectionsExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m= new HashMap<Integer,String>();
		m.put(0,"Boss"); m.put(1,"Boss1"); m.put(2,"Boss2"); m.put(3,"Boss3"); m.put(4,"Boss4");m.put(5,"Boss5");
		//System.out.println(m.get(1));
		
		Set s=m.entrySet();
		Iterator i = s.iterator(); //String is not used inside iterator. but in Hashset Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			
			Map.Entry me= (Map.Entry)i.next();
			System.out.println(me.getKey());			//in HashSet directly we print i.next();
			System.out.println(me.getValue());

		}
	}

}
