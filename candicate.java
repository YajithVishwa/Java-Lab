package management;
import java.util.*;

public class candicate extends Thread
{
	String name="YAJITH";
	int room=1;
	long ph=123456789;
	int day=1;
	ArrayList<String> l=new ArrayList<String>();
	public void run()
	{
		System.out.println("Hotel management Tce");
		System.out.println("--------------------");
		System.out.println("Name");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		l.add(name);
		System.out.println("Ph");
		ph=s.nextLong();
		System.out.println("How many rooms");
		room=s.nextInt();
		System.out.println("How many dates");
		day=s.nextInt();
		
	}
	public void display()
	{
		System.out.println("Hotel management Tce");
		System.out.println("--------------------");
		System.out.println("Name	:	"+name);
		System.out.println("Ph		:	"+ph);
		System.out.println("Room	:	"+room);
		System.out.println("Days	:	"+day);
		System.out.println("--------------------");
	}
	public void chechout(String name1)
	{
		int a;
		if(l.contains(name1))
		{
			a=0;
			System.out.println("Welcome visit again");
			
		}
		else
		{
			a=1;
			System.out.println("Name not registered");
			if(a==1)
			{
				System.out.println("Do you want to book.Press 1");
				Scanner s1=new Scanner(System.in);
				a=s1.nextInt();
				if(a==1)
				{
					candicate c4=new candicate();
					Thread t=new Thread(c4);
					t.start();
					try{
					c4.display();
					Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
					}
				}
				else
				{
					try
					{
						throw new Exception("Get Away");
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
			}
		}
	}
	public void pay()
	{
		if(room==1&&day==1)
		{
			System.out.println("Rs.2500");
		}
		else if(room==1&&day==2)
		{
			System.out.println("Rs.5000");
		}
		else if(room==2&&day==1)
		{
			System.out.println("Rs.7500");
		}
		else if(room==2&&day==2)
		{
			System.out.println("Rs.10000");
		}
		else
		{
			System.out.println("12000");
		}
	}
	public void wifi()
	{
		System.out.println("Wifi SSid	:	Tceit");
		System.out.println("Wifi password:	tceit");
	}
}