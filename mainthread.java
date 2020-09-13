import java.lang.*;
class mainthread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{			
			System.out.println(i);
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public static void main(String arg[])
	{
		Thread t=Thread.currentThread();
		mainthread m=new mainthread();
		Thread t1=new Thread(m);
		System.out.println("Current thread"+t);
		t.setName("Yajith");
		t.setPriority(2);
		System.out.println("Name of thread"+t);
		try
		{
			t1.start();
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}
	}
}