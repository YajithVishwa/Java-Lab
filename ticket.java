class travel1
{
	void bus()
	{
		System.out.println("The cost of semi-sleeper bus ticket Rs:3500");
	}
	void train()
	{
		System.out.println("The cost of semi-sleeper train ticket Rs:5000");
	}
}
class travel2
{
	void bus()
	{
		System.out.println("The cost of sleeper bus ticket Rs:4500");
	}
	void train()
	{
		System.out.println("The cost of sleeper train ticket Rs:7500");
	}
}
class ticket
{
	public static void main (String[] args) 
	{
		travel1 t1=new travel1();
		travel2 t2=new travel2();
		t1.bus();
		t1.train();
		t2.bus();
		t2.train();
	} 
}