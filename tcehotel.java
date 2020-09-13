import java.util.*;
import java.util.logging.*;
import management.candicate;
public class tcehotel
{
	public static final String user="admin";
	public static final String pass="login";
	private static final Logger log=Logger.getLogger(tcehotel.class.getName());
	public static void main(String arg[])
	{
		String a,b,name;
		System.out.println("Enter the user name");
		Scanner s2=new Scanner(System.in);
		a=s2.nextLine();
		System.out.println("Enter the password");
		b=s2.nextLine();
		if(a.equals(user)==true)
		{
			if(b.equals(pass)==true)
			{
				System.out.println("Name");
				Scanner s3=new Scanner(System.in);
				name=s3.nextLine();
				candicate c1=new candicate();
				c1.chechout(name);
				c1.pay();			
			}
		}
	}
}