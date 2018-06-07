package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedLIst {
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hey");
		ll.addFirst("Kanna");
		ll.addLast("Hie");
		
		System.out.println("Contents in LInked List"+ll);
		
		// prnt al the values of linked LIst
		//for loop
		System.out.println("Using For loop");
		for(int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}

		//advanced for loop
		System.out.println("Using advanced for loop");
		
		for(String st:ll) {
			System.out.println(st);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using While Loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
