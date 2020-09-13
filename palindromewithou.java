import java.util.*;
class palindromewithou
{
	public static void main(String arg[])
	{
		String a,b="";
		Scanner a1=new Scanner(System.in);
		a=a1.nextLine();
		int l=a.length();
		l=l-1;
		int k=0;
		int end=l/2;
		int z=0;
		for(int i=k;i<=end;i++)
		{
			if(a.charAt(k)==b.charAt(l))
			{
				k++;
				l--;
			}
			else
			{
				z=1;
				break;
			}
		}
		if(z==1)
		{
			System.out.println("Not a palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
	}	
		
}