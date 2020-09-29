package amazonAutomation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) throws Exception{
		
		testregex obj=new testregex();
		Class c=testregex.class;
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("check",null);
		    
		m.setAccessible(true);
		m.invoke(obj, null);
		
		
	}

}
interface test1
{
	
}
class testregex
{
	String s="Hello Testing";
	private void check()
	{
		String txt="Hello Harish Welcome Harish";
		Pattern p=Pattern.compile("Harish");
		Matcher m=p.matcher(txt);
		while(m.find()) {
		  System.out.println(m.group());
		  				
		}
		System.out.println(Pattern.matches("[+[ABab]][789][0-9]{9}","a9184892668"));	
	}
	
}
