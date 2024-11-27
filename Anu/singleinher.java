class student
{
void display()
{
System.out.println(" student fees=2000");
}	
}
class studentname extends student
{
void display1()
{
	System.out.println("student name = naliny ");
}
}
class singleinher
{	
public static void main(String args[])
{
	 studentname s1=new studentname();
	s1.display();
	s1.display1();
}
}
