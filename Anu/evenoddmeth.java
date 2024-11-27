class evenodd
{
int number;
void display(int n)
{
number=n;
}
void display1()
{
	if(number%2==0)
{
System.out.println("The given number is even");
}
else
{
System.out.println("The given number is odd");	
}
}
}
class evenoddmeth
{
	public static void main(String args[])
	{
		evenodd obj=new evenodd();
		obj.display(23);
		obj.display1();
}
}