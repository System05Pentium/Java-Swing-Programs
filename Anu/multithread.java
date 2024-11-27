class A extends Thread
{
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("From threadA with i ="+-1*i);
}
System.out.println("Existing from threadA");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<5;j++)
{
System.out.println("From threadB with j ="+-1*j);
}
System.out.println("Existing from threadB");
}
}
class  multithread
{
public static void main(String args[])
{
	A obj=new A();
    B obj1=new B();
	obj.start();
	obj1.start();
System.out.println("Multithreading is Over");
}
}









