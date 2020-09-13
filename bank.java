package banks;
import java.util.*;
public class bank
{
	public String name;
	public int age,ph,bankid,amount;
	public void getdata()
	{
		System.out.println("Name,age,PhoneNumber,Bank");
		Scanner a=new Scanner(System.in);
		name=a.nextLine();
		age=a.nextInt();
		ph=a.nextInt();
		bankid=a.nextInt();
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
	
}