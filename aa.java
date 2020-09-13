interface customer
{
	int id;int ph;int acc;
	String name;String address;
}
interface Account extends customer
{
	void bank()
	{
		int id,customerid;
	}
}
class checking implements Account{
	void bank()
	{
		int id=21;
		int customerid=12;
		System.out.println("id"+id+"customerid"+customerid);
	}
}
class Saving implements Account
{
	void bank()
	{
		int id=13;
		int customerid=31;	
		System.out.println("id"+id+"customerid"+customerid);
	}
}
class aa
{
	public static void main(String arg[])
	{
		Saving s=new Saving();
		s.bank();
		checking c;
		c.bank();
	}
}