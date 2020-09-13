public class singles implements Runnable
{
	Thread t;
	public int newthread()
	{
		t=new Thread("vishwa");
		t.start();
		return 0;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+"*"+" "+" "+"="+" "+i*i);
		}
	}
}
public class doubles extends singles
{
	singles s= new singles();
	int a=newthread();
}