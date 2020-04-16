package customerpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		
		 List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple"); 
	        
	        Iterator<String> itr = l.iterator();
	        
	        while(itr.hasNext()){
	        	
	        	if(Collections.frequency(l, itr.next())!=-1){
	        		
	        		itr.remove();
	        	}
	        }
	        
	        Collections.sort(l);
	        System.out.println(l);
	}

}
