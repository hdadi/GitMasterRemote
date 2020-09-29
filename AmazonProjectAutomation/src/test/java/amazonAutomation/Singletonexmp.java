package amazonAutomation;
public class Singletonexmp {

	public static void main(String[] args) {
		single object=single.getInstance();
		object.add(10,26);	

	}

}
class single
{
	public void add(int x,int y)
	{
		testregex o=new testregex();
		System.out.println(o.s);
		int c=x+y;
		System.out.println(c);
	}
	private static single obj=new single();
	
	private single()
	{
	System.out.println("Hello singleton");	
	}
	public static single getInstance()
	{
		return obj;
	}
}
