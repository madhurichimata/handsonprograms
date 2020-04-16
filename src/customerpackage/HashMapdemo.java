package customerpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapdemo {

	public static void main(String[] args) throws IOException {
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		File file=new File("D:\\vehicledata\\vehicle.txt");
		FileReader fr=new FileReader(file);
		BufferedReader bf=new BufferedReader(fr);
		
		List<String> l1 = new ArrayList<String>();
		
		String data = null;
		
		while((data =bf.readLine())!= null){
			
			l1.add(data);
		}
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()){
			
			String cardata = it.next();
			
			map.put(cardata, Collections.frequency(l1, cardata));
		}
		
		Set<Map.Entry<String, Integer>> vehicleset = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it1 = vehicleset.iterator();
		
		while(it1.hasNext()){
			
			Map.Entry<String, Integer> itr = it1.next();
			
			System.out.println(itr.getKey()+ "->" +itr.getValue());
		}

	}

}
