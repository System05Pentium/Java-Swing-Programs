import java.util.Scanner;
class sqrt
{
public static void main(String args[])
{
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the First number");
a=obj.nextInt();
System.out.println("Enter the Second number");
b=obj.nextInt();
System.out.println("Enter the Third number");
c=obj.nextInt();
try
{
double root1=((-b)-Math.sqrt((b*b)-4*a*c))/2*a;
double root2=((-b)+Math.sqrt((b*b)-4*a*c))/2*a;
if(Double.isNaN(root1))
{
System.out.println("To Infinity");	
}
else
{
System.out.println("root1 is :"  +root1);	
}
if(Double.isNaN(root2))
{
System.out.println("To Infinity");	
}
else
{
System.out.println("root2 is :"  +root2);	
}
}
catch(Exception e)
{
System.out.println("error occured");	
}
finally
{
System.out.println("program ended");		
}
}
}