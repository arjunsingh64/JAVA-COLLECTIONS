// Deque is used to perform both LIFO and LILO

import java.util.Collections;
import java.util.*;
public class dequeue
{
	public static void main(String [] args)
	{
		Deque<String>dq = new LinkedList<>();
		dq.add("arjun");
		dq.add("bopi");
		dq.add("chatu");
		dq.add("dog");
		dq.add("elephant");
		
		for(Iterator it = dq.iterator();it.hasNext();)
		System.out.print(it.next() + " ");
		
		dq.addFirst("kalu");
			
		System.out.println();	
			
		for(Iterator it1 = dq.iterator();it1.hasNext();)
		System.out.print(it1.next() + " ");	
	
		dq.push("asdf");	

		System.out.println();			

		for(Iterator it2 = dq.iterator();it2.hasNext();)
		System.out.print(it2.next() + " ");

		dq.pop();
		System.out.println();	
		
		for(Iterator it2 = dq.iterator();it2.hasNext();)
		System.out.print(it2.next() + " ");
	
		System.out.println();

		System.out.println(dq.peek());

	}
}
