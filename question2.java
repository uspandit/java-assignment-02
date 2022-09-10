import java.util.Scanner;
class question2
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int a,b;
System.out.println("enter a number");
a=ob.nextInt();
System.out.println("enter another number");
b=ob.nextInt();
if(a>b)
	System.out.println("greater number is:"+a);
else
	System.out.println("greater number is:"+b);
}
}