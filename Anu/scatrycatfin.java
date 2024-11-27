import java.util.Scanner;
class scatrycatfin
{
public static void main(String args[])
{
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the first number");
a=obj.nextInt();
System.out.println("Enter the second number");
b=obj.nextInt();
try
{
c=a/b;
System.out.println("value of a/b is :"  +c);	
}
catch(ArithmeticException e)
{
System.out.println("invalid input");	
}
finally
{
	obj.close();
}
}
}

