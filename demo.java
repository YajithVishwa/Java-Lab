import java.util.*;
import java.io.*;
class demo
{
int id,year,fine;
String name;
void getdata()
{
Scanner b=new Scanner(System.in);
System.out.println("Enter your name");
name=b.nextLine();
System.out.println("Enter your id");
id=b.nextInt();
System.out.println("Enter your fine amount");
fine=b.nextInt();
}
void display()
{
System.out.println("Your ID: "+id);
System.out.println("Your name: "+name);
System.out.println("Your fine: "+fine);
}
}
class hosteller extends demo
{
void getData()
{
getdata();
int fees=70000;
display();
System.out.println("Your hostel fees: "+fees);
}
}
class day_s extends demo
{
void getDetails()
{
getdata();
int bus;
bus=10000;
System.out.println("Your bus fees :"+bus);
display();	
}	
}
class heirarchical
{
public static void main(String arg[])
{
int l;
System.out.println("Are you an hosteller or daysscholar.Press 1 for hosteller otherwise 0");
Scanner v=new Scanner(System.in);
l=v.nextInt();
if(l==0)
{
day_s d=new day_s();
d.getDetails();
}
else
{
hosteller h=new hosteller();
h.getData();
}
}
}