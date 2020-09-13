package management;
import java.util.*;

public class candicate
{
	String name;
	int room;
	long ph;
	int day;
	ArrayList<String> l=new ArrayList<String>();
	void run()
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
	void display()
	{
		System.out.println("Hotel management Tce");
		System.out.println("--------------------");
		System.out.println("Name	:	"+name);
		System.out.println("Ph		:	"+ph);
		System.out.println("Room	:	"+room);
		System.out.println("Days	:	"+day);
		System.out.println("--------------------");
	}
	void chechout(String name1)
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
					Thread t=new Thread();
					t.start();
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
	void pay()
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
}
public class hotel extends candicate
{
	hotel()
	{
		System.out.println("You are the manager of the hotel");
	}
	void wifi()
	{
		System.out.println("Wifi SSid	:	Tceit");
		System.out.println("Wifi password:	tceit");
	}
	void payment()
	{
		
		candicate c=new candicate();
		c.display();
		c.pay();
	}
}