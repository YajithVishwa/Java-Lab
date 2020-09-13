import java.util.*;
public class bill
{
	void washingmachine()
	{
		int total=50000;
		System.out.println("The total amount is"+total);
	}
	void fridge()
	{
		int total=35000;
		System.out.println("The total amount is"+total);
	}
	void stove()
	{
		int total=3000;
		System.out.println("The total amount is"+total);
	}
}
public class shop extends bill{
	void gst()
	{
		System.out.println("The gst is 10%");
	}
	void tax()
	{
		System.out.println("The tax is 5%");
	}
}
public class main extends shop{
	public static void main(String arg[])
	{
		main m=new main();
		int s;
		System.out.println("1.Washingmachine,2.fridge,3.stove");
		Scanner a=new Scanner(System.in);
		s=a.newInt;
		switch(s)
		{
			case 1:m.washingmachine();m.gst();m.tax();break;
			case 2:m.fridge();m.gst();m.tax();break;
			case 3:m.stove();m.gst();m.tax();break;
			default:m.gst();m.tax();break;
		}
		}
	}