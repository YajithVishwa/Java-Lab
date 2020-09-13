class first
{
	public void display(String msg)
	{
		System.out.println("Message is "+msg);
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}
		System.out.println("End");
	}
}
class second implements Runnable
{
	String ss;
	first fi;
	second(first f,String m)
	{
		fi=f;
		ss=m;		
		run();	
	}
	public void run()
	{
		synchronized(fi)
		{
			fi.display(ss);
		}
	}
	
}
public class third
{
	public static void main(String arg[])
	{
		first f=new first();
		second s1=new second(f,"hello");
		second s2=new second(f,"hi");
		second s3=new second(f,"namaste");
	}
}