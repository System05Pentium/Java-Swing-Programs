class A extends Thread
{
public void run()
{
	System.out.println("Thread A Start");
for(int i=1;i<5;i++)
{
System.out.println("From Thrad A i ="+i);
}
System.out.println("Existing from Thread A");
}
}
class B extends Thread
{
public void run()
{
	System.out.println("Thread B Start");
for(int j=1;j<5;j++)
{
System.out.println("From Thrad B j ="+j);
}
System.out.println("Existing from Thread B");
}
}
class C extends Thread
{
public void run()
{
	System.out.println("Thread C Start");
for(int k=1;k<5;k++)
{
System.out.println("From Thrad C K ="+k);
}
System.out.println("Existing from Thread C");
}
}
class  prioritythread
{
public static void main(String args[])
{
	A obj=new A();
    B obj1=new B();
	C obj2=new C();
	
	obj2.setPriority(Thread.MAX_PRIORITY);
	obj1.setPriority(obj1.getPriority()+1);
	obj.setPriority(Thread.MIN_PRIORITY);
	
	
	obj.start();
	obj1.start();
	obj2.start();
System.out.println("Multithreading is Over");
}
}
