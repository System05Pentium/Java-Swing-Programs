class defconstructor
{
int id;
String name;
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String args[])
{
	defconstructor s1=new defconstructor();
	s1.display();
}
}