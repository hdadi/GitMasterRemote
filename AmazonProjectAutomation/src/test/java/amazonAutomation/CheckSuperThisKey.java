package amazonAutomation;

public class CheckSuperThisKey {

	public static void main(String[] args) {
		
		

	}

}
class parent
{
	public void m1()
	{
		
		System.out.println("This is parent class method");
	}
}
class child extends parent
{
	public void m2()
	{
		System.out.println("This is from child class - m2");
	}
	public void m3()
	{
		super.m1();
		this.m2();
		System.out.println("This is child class method");
		
	}
}
