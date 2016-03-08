/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddInts
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr = { 1,2,3,2,1,1,2,3,2,2,4,5,5,4,6,6,5,4,4,2,4,3};
		
		//- Create a HashMap to store the integers
		HashMap<Integer, Integer> h1 = new HashMap();
		for(int i=0; i<arr.length; i++) {
			if(!h1.containsKey(arr[i])) {
				h1.put(arr[i], 1);
			}
			else {
				h1.put(arr[i], h1.get(arr[i])+1);
			}
		}
		//- Check if they are odd (mod 2 =1) and add to arraylist
		Iterator it = h1.entrySet().iterator();
		ArrayList<Integer> a = new ArrayList();
		while(it.hasNext()) {
			Map.Entry tuple = (Map.Entry)it.next();
			Integer n = (Integer)tuple.getValue();
			if(1 == (n.intValue())%2) {
				a.add((Integer)tuple.getKey());
			}
		}
		//h1.clear();
		//- Create an array based on the arraylist size and populate the array.
		int [] b = new int[a.size()];
		Iterator<Integer> its = a.iterator();
		for(int i=0; i<b.length; i++) {
			b[i] = its.next().intValue();
		}
		System.out.println(Arrays.toString(b));
	}
}
