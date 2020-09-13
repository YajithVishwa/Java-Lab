import java.util.*;
import java.io.*;
public class buffer
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		String a;
		try
		{
			br=new BufferedReader(new FileReader("input.txt"));
			bw=new BufferedWriter(new FileWriter("buffer.txt"));
			while((a=br.readLine())!=null)
			{
				bw.write(a);
			}
				br.close();
			bw.close();
		}
		catch(IOException e)
		{
		}
		finally
		{
		
		}
	}
}