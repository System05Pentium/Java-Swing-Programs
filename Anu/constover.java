class constover
{
int id;
String name;
int age;
constover(int i,String n)
{
id=i;
name=n;
}
constover(int i,String n, int a )
{
id=i;
name=n;
age=a;
}
void display()
{
	System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
	constover s1=new constover(12,"Devu",22);
	s1.display();
	constover s2=new constover(24,"achu",21);
	s2.display();
}
}