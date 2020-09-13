import java.util.*;
public class multi extends Thread
{
	public void run()
	{
		System.out.println("r1");
	}
	public static void main(String arg[])
	{
		multi m=new multi();
		m.start();
		multi mn=new multi();
		mn.start();
		System.out.print(mn.isAlive());
	}
}