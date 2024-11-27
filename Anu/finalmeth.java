class A
{
final void run()
{
System.out.println("hi");
}
}
class B extends A
{
	
	 //void run()
	 void dis()
	{
		System.out.println("halo");
		
	}
}
	class finalmeth
	{
		public static void main(String args[])
		{
			B d=new B();
			d.run();
			d.dis();
		}
	}
	