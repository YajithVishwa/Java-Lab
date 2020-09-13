import java.util.logging.*;

class logs
{
	public void text()
	{
		System.out.printf("%s\n","This is text formatter");
	}
	public static void info()
	{
		System.out.printf("\n%s","Log level information");
	}
}
public class logging
{
	public static final Logger l=Logger.getLogger(logging.class.getName());
	public static void main(String arg[])
	{
		logs lo=new logs();
		l.log(Level.INFO,"First level");
		lo.info();
		l.log(Level.SEVERE,"Urgert move on");
		lo.text();
		lo.info();
		l.log(Level.FINE,"Fine level");
		lo.info();
	}
}