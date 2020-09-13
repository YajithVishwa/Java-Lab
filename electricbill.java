import java.util.*;
class electric
{
	void upto199(int unit)
	{
		double  sum=unit*1.20;
		System.out.println("The total amount is"+sum);
	}
	void lessthan400(int unit)
	{
		double sum=unit*1.50;
		System.out.println("The total amount is"+sum);
	}
	void lessthan600(int unit)
	{
		double sum=unit*1.80;
		double dis=sum*0.15;
		System.out.println("The total amount is"+dis);
	}
	void above600(int unit)
	{
		double sum=unit*2.0;
		double dis=sum*0.15;
		System.out.println("The total amount is"+dis);
	}
}
class electricbill extends electric
{
	public static void main(String arg[])
	{
		electricbill e=new electricbill();
		int s;
		System.out.println("Enter the unit");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		if(s<199)
		{
			e.upto199(s);
		}
		else if(s>200 && s<399)
		{
			e.lessthan400(s);
		}
		else if(s>400 && s<599)
		{
			e.lessthan600(s);
		}
		else
		{
			e.above600(s);
		}
	}
}