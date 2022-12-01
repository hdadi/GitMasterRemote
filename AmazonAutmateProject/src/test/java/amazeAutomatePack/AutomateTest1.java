package amazeAutomatePack;
import java.util.*;

public class AutomateTest1 {
//adding a comment
	//comment form GitHub Web
	public static void main(String[] args) {
		
		System.out.println("REMOVING DUPLICATES OF AN ARRAY");
		int[] arr1= {22,46,22,44,22,46,54,68,46,68,22,44,86,88,89,85,88,84};
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		  for(int i:arr1)
		{
			set.add(i);
		}
		System.out.println(set);
	
	}

}
