import java.util.Scanner;
class Sintrest
{
public static void main(String args[])
{
int p,r,n;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Principle Amount");
p=obj.nextInt();
System.out.println("Enter the Ratio");
r=obj.nextInt();
System.out.println("Enter the Time");
n=obj.nextInt();
float SI=(p*n*r)/100;
System.out.println("Simple intrest is :" + SI);
}
}
