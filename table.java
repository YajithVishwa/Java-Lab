import java.util.*;
public class table
{
	public static void main(String arg[])
	{
		int row,col;
		System.out.println("Enter the row and col");
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		col=s.nextInt();
		int [][] a=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}