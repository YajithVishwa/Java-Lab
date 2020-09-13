package banks;
import java.util.*;
public class bank
{
	public String name;
	public int age,ph,bankid,amount;
	public void getdata()
	{
		System.out.println("Name,age,PhoneNumber,AccountNo,Balance");
		Scanner a=new Scanner(System.in);
		name=a.nextLine();
		age=a.nextInt();
		ph=a.nextInt();
		bankid=a.nextInt();
		amount=a.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age :"+age);
		System.out.println("Ph :"+ph);
		System.out.println("BankNo : "+bankid);		
	}
	public void deposite(int dep)
	{
		amount+=dep;
		System.out.println("SuccessFully Deposited "+name);
	}
	public void withdraw(int with)
	{
		if(with<amount)
		{
			amount-=with;
			System.out.println("SuccessFully Withdrawed "+name);
			System.out.println("The remaining balance "+amount);
		}
		else{
			System.out.println("Sorry Bank Balance is low");
		}
	}
	public static void main(String arg[])
	{
		bank b1=new bank();
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
	}
	
}