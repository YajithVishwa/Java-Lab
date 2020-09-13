import java.util.logging.*;
import java.util.*;
import java.io.*;
public class log
{
	private static final Logger logg=Logger.getLogger(log.class.getName());
	public static void main(String arg[]) throws IOException
	{
		Handler h=new FileHandler("test.log",true);
		h.setFormatter(new XMLFormatter());
		logg.addHandler(h);
		logg.setLevel(Level.INFO);
		try
		{
			logg.info("Hello");
			throw new Exception("Dai");
		}
		catch(Exception e)
		{
			logg.log(Level.INFO,"hello",e);
		}
	}
}