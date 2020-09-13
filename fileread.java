import java.io.*;
import java.util.*;
public class fileread
{
	public static byte[] readFileToByteArray(File file)
	{
		FileInputStream ip=null;
		byte[] b=new byte[(int)file.length()];
		try
		{
			
			ip=new FileInputStream(file);
			ip.read(b);ip.close();
		}
		catch(IOException e)
		{
			
		}
		
		return b;
	}
	public static void main(String arg[]) throws IOException
	{
		File ip=new File("input.html");
		File op=new File("output.txt");
		//FileInputStream fp=new FileInputStream(ip);
		byte[] a=readFileToByteArray(ip);
		for(int i=0;i<a.length;i++)
		{
			System.out.print((char)a[i]);
		}
	}
}