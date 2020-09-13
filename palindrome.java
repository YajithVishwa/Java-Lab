import java.util.*;
class palindrom
{
	public static void main(String arg[])
	{
		String a,b="";
		Scanner a1=new Scanner(System.in);
		a=a1.nextLine();
		int l=a.length();
		for(int i=l-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}