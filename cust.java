import banks.*;
import java.util.*;
public class cust
{
	public void receipt(String name,int age,int bankid,int ph,int amount)
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Bank Number "+bankid);
		System.out.println("Ph No "+ph);
		System.out.println("Available balance "+amount);
	}
	public static void main(String arg[])
	{
		String name;
		int age,bank,ph,amount;;
		cust c=new cust();
		bank b1=new bank();
		name=b1.name;
		age=b1.age;
		bankid=b1.bankid;
		ph=b1.ph;
		amount=b1.amount;
		b1.getdata();
		int e,r;
		System.out.println("Do you want to withdraw or deposit");
		System.out.println("Press 1 for withdraw or 2 for deposit");
		Scanner s1=new Scanner(System.in);
		e=s1.nextInt();
		if(e==1)
		{
			System.out.println("Enter the amount to withdraw");
			r=s1.nextInt();
			b1.withdraw(r);
		}
		else{
			System.out.println("Enter the amount to deposite");
			r=s1.nextInt();
			b1.deposite(r);
		}
		c.receipt(name,age,bankid,ph,amount);		
	}
}