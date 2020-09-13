import java.util.*;
interface objects
{
	final double pi=3.14;
	abstract public void circle(int r);
	abstract public void rectangle(int l,int b);
}
interface object1 extends  objects
{
	abstract public void triangle(int h,int b);
	abstract public void square(int l);
}
public class area implements object1,objects
{
	public void circle(int r)
	{
		double sum=pi*(double)r*(double)r;
		System.out.println("The area of circle is"+sum);
	}
	public void rectangle(int l,int b)
	{
		int sum=l*b;
		System.out.println("The area of rectange is"+sum);
	}
	public void triangle(int h,int b)
	{
		int sum=(h*b)/2;
		System.out.println("The area of triangle is"+sum);
	}
	public void square(int l)
	{
		int sum=l*l;
		System.out.println("The area of square is"+sum);
	}
	public static void main(String arg[])
	{
		int r,l,b,h;
		area a1=new area();
		System.out.println("Enter the radius,length,breath,height");
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		l=s.nextInt();
		b=s.nextInt();
		h=s.nextInt();
		a1.circle(r);
		a1.rectangle(l,b);
		a1.triangle(h,b);
		a1.square(l);
	}
}