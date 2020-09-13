class MyThread implements Runnable
{
	String name;
	Thread t;
	MyThread (String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
	}
		try
		{
			int i=0;
			for(i=0;i<10;i++)
			{
				yeild();
				System.out.println(name+" "+i+"*"+i+"=");
				Thread.sleep(1000);
			}
			System.out.print(i*i);
		}
		catch(Exception e)
		{
			System.out.println("Done");
		}
	}
}
public class threads
{
	public static void main(String arg[])
	{
		new MyThread("yajith");
		new MyThread("vishwa");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
	}
}