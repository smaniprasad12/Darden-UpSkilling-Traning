package JavaPrograms;

import java.util.AbstractSequentialList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> obj=new LinkedList<Integer>();
		obj.add(12);
		obj.add(34);
		obj.add(45);
		obj.add(67);
		obj.add(55);
		obj.add(644);
		obj.add(6678);
		Collections.sort(obj);
//		Iterator<Integer> itr=obj.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());
		System.out.println(obj);
	

	//}
		LinkedList<Integer> obj2=new LinkedList<Integer>();
		obj2.add(49);
		obj2.add(34);
		obj2.add(45);
		obj2.add(67);
		obj2.add(46);
		
		obj2.removeAll(obj);
		System.out.println(obj2);
		
				
				
	
	}
	
	

}
