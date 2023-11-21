package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

  

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product2> list=new ArrayList<Product2>();  
        
        //Adding Products  
        list.add(new Product2(1,"HP Laptop",25000f));  
        list.add(new Product2(3,"Keyboard",300f));  
        list.add(new Product2(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
//        Collections.sort(list,(p1,p2)->{  
//        return p1.name.compareTo(p2.name);  
//        });  
//        for(Product2 p:list){  
//            System.out.println(p.id+" "+p.name+" "+p.price);  
//        } 
        Collections.sort(list,(p1,p2)->{
        	return p1.name.compareTo(p2.name);});
       

	}

}
