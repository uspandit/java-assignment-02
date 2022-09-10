import java.util.Scanner;
class question1
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
double l,b;	
System.out.println("enter length of rectangle");
l=ob.nextDouble();
System.out.println("enter breadth of rectangle");
b=ob.nextDouble();
if(l==b)
	System.out.println("It is a square");
else
	System.out.println("Not square");
}
}