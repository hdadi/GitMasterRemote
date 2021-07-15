package amazonAutomation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class IterateHashMaps {
	
	public static void main(String[] args) {
		String[] keys= {"ANDHRA PRADESH","Himachal Pradesh","ANdhra praDESH","Arunachal Pradesh","KarnataKA state","Kerala State","Andhra PRADEsh","AndHRa PraDEsh","KARNataka STate"};
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Hashmaps Keys");
		/* String keyss=s.nextLine();
		String[] names=keyss.split(" ");
		System.out.println(names.hashCode()); */
		
		//to print duplicate elements count of an array
		for(String key:keys)
		{
			key=key.toUpperCase();
			Integer value=hm.get(key);
			hm.put(key,(value==null)?1:value+1);						
		
		}
		
		System.out.println(hm);
		Collection<Integer> values=hm.values();
		System.out.println(values);

	}
}


