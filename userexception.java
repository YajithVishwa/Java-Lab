import java.util.*;
class exceptions extends Exception
{
	public exceptions(String s)
	{
		super(s);
	}
}
public class userexception 
{
	public static void main(String arg[])
	{
		try{
			int a=5;
			int b=5;
			int sum=a+b;
			System.out.printf("Sum is %d and a and b values are %d,%d\n",sum,a,b);
			throw new exceptions("Error occured due to addition of two numbers");
		}
		catch(exceptions e)
		{
			System.out.println(e);
		}
	}
}