import java.io.*;
class fileb
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader r=new BufferedReader(new FileReader("input.txt"));
		BufferedWriter w=new BufferedWriter(new FileWriter("outputb.txt"));
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		r.close();
		w.close();
	}
}