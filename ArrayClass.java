import java.util.Collections;
import java.util.Arrays;
import java.util.*;
public class ArrayClass
{
	public static void main(String [] args)
	{
		
		int arr [] = {4,3,2,1,5,5,6};
		//Integer [] arr = new Integer[] {4,3,2,1,5,5,6};		
		// to sort array 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
/*		
		// to Sort in decending order
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		// binarySearch in array   Arrays.binarySearch ( arrayElement , key)
*/
		int key = 4;
		System.out.println(key + " found at index " + Arrays.binarySearch(arr,key));
		// binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c)	
		System.out.println(Arrays.binarySearch(arr,0,4,4));
		
		// Equals in Java
		int arr2 [] = {3,2,1};
		System.out.println(Arrays.equals(arr,arr2));
			
		//Copyof in Java
		int [] copy = Arrays.copyOf(arr2,5);
		for(int i=0;i<copy.length;++i)
		{
			System.out.println(copy[i]+ " ");
		}
		//Copy of range (originalArray,from index, end index)
		System.out.println("Arrays copy in Range : " + Arrays.toString(Arrays.copyOfRange(arr,0,3)));
		
		//To fills the element in the array Arrays.fill(original array,fill value )
		
		Arrays.fill(copy,100);
		System.out.println(Arrays.toString(copy));
		
		// MISMATCH FUNCTIONS RETURNS  THE FIRST ELEMENT WHICH IS NOT MATCHED 	
		//System.out.println(Arrays.mismatch(arr,arr2));		
		
		Arrays.parallelSort(arr2);	
		System.out.println(Arrays.toString(arr2));
			
	}
}
