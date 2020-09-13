package maths;
import java.util.*;
public class arithematic
{
	public void calculate(int a,int b)
	{
		int sum=0;
		int c;
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		switch(c)
		{
			case 1:System.out.println(a+b);break;
			case 2:System.out.println(a-b);;break;
			case 3:System.out.println(a*b);break;
			case 4:System.out.println(a/b);break;
			default:System.out.println("Incorrect Input");break;
		}
	}
}