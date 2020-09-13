import java.util.*;
import java.io.*;
class students
{
		String name;
		String roll;
		String cpga;
		public String inputs()
		{
			System.out.println("Enter the name,roll,cgpa");
			Scanner a=new Scanner(System.in);
			name=a.nextLine();
			roll=a.nextLine();
			cpga=a.nextLine();
			String st=name+roll+cpga;
			return st;
		}
}
class student
{
	public static void main(String arg[])
	{
		FileInputStream in=null;
		FileOutputStream ou=null;
		ou=new FileOutputStream("output.txt");
		students s[]=new students[5];
		for(int i=0;i<5;i++)
		{
			String v=s[i].inputs();
			ou.write(v);
		}
		ou.close();
	}
}