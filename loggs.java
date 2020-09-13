import java.util.logging.*;
class loggs
{
	public static final Logger log=Logger.getLogger(loggs.class.getName());
	public static void main(String arg[])
	{
		try
		{
		log.info("Start logging");
		log.log("Ending with error");
		throw new Exception("Hello");
		}
		catch(Exception e)
		{
			//log.log(Level.SEVERE);
			log.log(e);
		}
	}
}