class vehicle
{
void run()
{
System.out.println("vehicle is running");
}	
}
class car extends vehicle
{
void run()
{
	System.out.println("car is running safely ");
}
}
class overrime
{	
public static void main(String args[])
{
	  car s1=new car();
	s1.run();
	
}
}
