package Week1ofJan;

import java.util.*;
import java.util.stream.Collectors;

/*
 "4. array [1,2,3,4,5] ->   

 *   

 * 4.2 Delete element at index 3.  

 * 4.3 Sum of all elements in array.  

 * 4.4  Check if all elements in array is > 10. 

 * 4.5 Check if either of element in array is 0  "

*/

public class ArrayInsertion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5};
		List<Integer> list=new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		
		System.out.println("Array before operations"+list);
		
		//4.1 Insert Element 11 at beginning of the array, insert element 11 at index 2, insert element at last index.
		list.add(0,11);
		list.add(2,11);
		list.add(11);
		System.out.println("list after adding at 0th,2nd,and last "+list);
		
		//4.2 Delete element at index 3. 
		list.remove(3);
		
		System.out.println("array after deleting element at index 3 "+list);
		
		
		// * 4.3 Sum of all elements in array.  
		int sum=list.stream().mapToInt(a->a).sum();
		
		System.out.println("sum of all elements in array"+list+" is "+sum);
		
		//4.4  Check if all elements in array is > 10.
		
		for(int i:list) {
			if(i>10) {
				continue;
			}
			else {
				System.out.println("not all elemnts are greater than 10 ");
				break;
			}
		}
		
		//4.5 Check if either of element in array is 0 
		for(int j=0;j<list.size();j++) {
			if(list.get(j)==0) {
				System.out.println("Element at index "+j+" is 0");
			}
		}
		
		
		
		
		
		
		

	}

}
