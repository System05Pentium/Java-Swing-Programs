class A implements Runnable
{
	String name;
	Thread thread;
	A(String name)
	{
		this.name=name;
		thread=new Thread(this);
		System.out.println("Anew thread:"+thread+"is created");
		thread.start();
	}

	public void run()
	{
		try
		{
		
			for(int j=5;j>0;j--)
			{
				System.out.println("Name : "+j);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name +"Thread interrupted");
		}
		System.out.println(name +"Thread Existing");
	}
}
class  threadimple
{
	public static void main(String args[])
	{
		new A("1st");
		new A("2nd");
		new A("3rd");
		try
		{
			Thread.sleep(8000);
		}
	
		catch(InterruptedException exception)
		{
			System.out.println("Interruption occured in main thread");
		}
		System.out.println("We are existing from main thread");
	}
}