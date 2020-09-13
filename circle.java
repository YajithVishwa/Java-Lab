public class circle
{
	private int centre,radius;
	void static getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Radius");
		radius=sc.nextInt();
		int area=2*3.14*radius;
		System.out.println("The area of circle is"+area);
	}
	void static printing()
	{
		System.out.println("The instance variable is centre and radius");
		System.out.println()
	}
	
}