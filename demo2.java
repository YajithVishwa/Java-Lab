public class demo2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String arg[])
	{
		for(int i=0;i<5;i++)
		{
			demo2 thread=new demo2();
			Thread t=new Thread(thread);
			t.start();
			if(Thread.currentThread().getId()%2==0)
			{
			Thread t1=new Thread(thread);
			t1.start();
			}
		}
	}
}
