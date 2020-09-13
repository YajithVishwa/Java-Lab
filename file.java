import java.io.*;
class file
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream in=null;
		FileOutputStream ou=null;
		try{
			in=new FileInputStream("input.txt");
			ou=new FileOutputStream("output.txt");
			int i;
			while((i=in.read())!=-1)
			{
				ou.write(i);
			}
		}
		finally{
			if(in!=null)
			{
				in.close();
			}
			if(ou!=null)
			{
				ou.close();
			}
		}
	}
}