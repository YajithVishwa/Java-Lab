import java.util.*;
import java.io.*;
class user extends Exception
{
	user(String e)
	{
	super(e);
	System.out.println("Hello");
	}
}
public class excp
{
	public static void main(String arg[])
	{
		try{
			System.out.println("Hi");
			throw new user("User");
		}
		catch(user y)
		{
			if(y.equalsIgnoreCase("user9"))
			{
			System.out.println(y);
			}
		}
	}
}