import java.io.*;
import java.util.*;

public class files{
public static void main(String args [])throws IOException{
FileReader f1 = new FileReader("roll.txt");
BufferedReader b = new BufferedReader(f1);
Hashtable<String,String> hash= new Hashtable<String,String>();
String word[]= null;
String s;
while((s=b.readLine())!=null )    
{
word=s.split("\t");
hash.put(word[0], word[1]);
}f1.close();
 for(Map.Entry m:hash.entrySet()){  
  System.out.println("Student name : "+m.getKey()+"\tReg Number : "+m.getValue());  
 }
}
}