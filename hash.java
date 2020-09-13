import java.util.*;
import java.io.*;
public class hash
{
	public static void main(String arg[]) throws Exception
	{
		Hashtable<String,Integer> h = new Hashtable<String,Integer>();
		int a,regno;String name;
		FileOutputStream ou;
		ou=new FileOutputStream("output..txt");
		ObjectOutputStream out = new ObjectOutputStream(ou);
		name="yajith";
		regno=116;
		h.put(name,regno);
		name="vishwa";
		regno=854;
		h.put(name,regno);
		out.writeObject(h);
		ou.close();
		for (String i : h.keySet()) {
      	System.out.println(i+"	"+h.get(i));
    	}
		
	}
}