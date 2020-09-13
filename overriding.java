import java.util.*;
abstract class demo
{
	abstract void shopping1();
	abstract void shopping2();	
}
class demo1 extends demo
{
	void shopping1()
	{
		int a=1000;
		System.out.println("The amount spent on shop 1 :"+a);
	}
	void shopping2()
	{
		int b=2500;
		System.out.println("The amount spent on shop 3:"+b);
	}
}
class demo2 extends demo
{
	void shopping1()
	{
		int c=5000;
		System.out.println("The amount spent on shop 2 :"+c);
	}
	void shopping2()
	{
		int d=10000;
		System.out.println("The amount spent on shop 4 :"+d);
	}
}
class overriding
{
	public static void main(String arg[])
	{
		String name;
		System.out.println("Enter your name");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		System.out.println("Your name : "+name);
		demo1 d1=new demo1();
		demo2 d2=new demo2();
		d1.shopping1();
		d2.shopping1();
		d1.shopping2();
		d2.shopping2();
		
	}
}