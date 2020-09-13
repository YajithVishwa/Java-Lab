class First implements Runnable
{
 public void display(String msg)
 {
  System.out.print ("["+msg);
  try
  {   Thread.sleep(1000);  }
  catch(InterruptedException e)
  {   e.printStackTrace();  }
  System.out.println ("]");
 }}
 class Second extends Thread
{
 String msg;  
 First fobj;
 Second (First fp,String str)
 {
  fobj = fp;
  msg = str;
  start(); }
 public void run()
 {  synchronized(fobj)       //Synchronized block
  {   fobj.display(msg);  } }}
 public class Syncro
{ public static void main (String[] args) 
 {  First fnew = new First();
  Second ss = new second(fnew, "welcome");
  Second ss1= new second (fnew,"new");
  Second ss2 = new second(fnew, "programmer");
 }}

