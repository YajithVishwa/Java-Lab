import java.util.*;
import java.io.*;
public class rever
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=null;
		//BufferedWriter bw=null;
		String a;
		List<String> l=new List<String>();
		try
		{
			br=new BufferedReader(new FileReader("input.txt"));
			//bw=new BufferedWriter(new FileWriter("buffer.txt"));
			while((a=br.readLine())!=null)
			{
				l.add(a);
			}
				br.close();
		}
		catch(IOException e)
		{
		}
		finally
		{
			for(int i=l.size();i>0;i++)
			{
				System.out.println(l.get(i));
			}
		
		}
	}
}