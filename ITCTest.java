import java.util.*;
import java.io.*;
public class ITCTest extends Thread
{
	public static void multipleoftwo()
	{
		for(int i=2;i<20;i*=2)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void multipleofthree()
	{
		for(int i=3;i<30;i*=3)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(10);
				wait();
			}
			catch(InterruptedException e)
			{
			}
			catch(IllegalMonitorStateException e)
			{
			}
		}
	}
	public void multiple(Thread t,ITCTest it)
	{
		String a="two";
		String b="three";
		if(a.equals(t.getName()))
		{
			try{
			yield();
			multipleofthree();
			}
			catch(Exception e)
			{
			}
		}
		else
		{
			it.multipleoftwo();
		}
	}
	public static void main(String arg[])
	{
		ITCTest it=new ITCTest();
		Thread t=new Thread(it);
		t.setName("two");
		ITCTest it1=new ITCTest();
		Thread t1=new Thread(it);
		t1.setName("three");
		it.multiple(t,it);
		it.multiple(t1,it1);
	}
}