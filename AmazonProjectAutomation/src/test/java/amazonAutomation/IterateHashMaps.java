package amazonAutomation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMaps {

	public static void main(String[] args) {
		String[] keys= {"Andhra Pradesh","Arunachal Pradesh","Karnata state","Kerala State"};
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Andhra Pradesh",1);
		hm.put("Arunachal Pradesh",1); 
		for(int i=0;i<keys.length;i++)
		{	
			if(hm.containsKey(keys[i]))
			{
				int count=1;
				hm.put(keys[i],count+1);
				
			}
			else
				hm.put(keys[i],1);
		}
		System.out.println(hm);
	/*	for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			if(entry.getKey().equalsIgnoreCase("AnDhra Pradesh")) {
				entry.setValue(entry.getValue()+1);
			}
			System.out.println("Key is: -->> "+entry.getKey()+"&"+"Value is -->"+entry.getValue());
		} */
		

	}

}
