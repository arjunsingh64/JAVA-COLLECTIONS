import java.util.Collections;
import java.util.*;
public class col
{
	public static void main(String [] args)
	{
/*
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(5);
		al.add(5);
		Set<Integer>s = new HashSet<>(al);
		// frequency of every elements present in an array		
		for(Integer i : s)
		System.out.println(i + ": "+Collections.frequency(al,i));	
		
		Integer a = Collections.frequency(al,5);
		System.out.println(a);
		
		// Sorting in reverse orders
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);		

*/
			 
ArrayList <Integer> list = new ArrayList<>();
list.add(3);
list.add(5);
list.add(2);
list.add(1);
list.add(6);
System.out.print(Collections.binarySearch(list, 2) + " ");
Collections.sort(list);
System.out.print(Collections.binarySearch(list, 2)); 
	}
}
