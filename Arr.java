import java.util.Arrays;
import java.util.*;
public class Arr
{
	public static void main(String [] args)
	{
		/*
		Integer [] arr = {1,2,3,4,5,6,7,8,9};
		arr.removeIf(n -> (n%2==0));
		System.out.println(Arrays.toString(arr));	
		*/
		
		Vector<Integer>v = new Vector<>();
		v.addElement(10);
		v.addElement(21);
		v.addElement(13);
		v.addElement(17);
		v.addElement(16);
		v.addElement(152);
		v.removeIf(n->(n%2==0));	
		for(Iterator it = v.iterator() ; it.hasNext();)
		{
			System.out.println(it.next());		
		}
		Vector<String>v1 = new Vector<>();
		v1.addElement("arjun");
		v1.addElement("singh");
		v1.addElement("rajput");
		v1.removeIf(n -> (n.charAt(0) == 'r'));
		for(Iterator it1 = v1.iterator() ; it1.hasNext();)
		{
			System.out.println(it1.next());		
		}
		/*ArrayList<Integer>li = new ArrayList<>();
		li.add(5);
		li.add(2);
		li.add(7);
		li.removeIf(n->(n%2==0));
		

	
		for(Iterator it = li.iterator() ; it.hasNext();)
		{
			System.out.println(it.next());		
		}
		*/
	}
}

