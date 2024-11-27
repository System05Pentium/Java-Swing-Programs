class paraconstructor
{
int id;
String name;
paraconstructor(int i,String n)
{
id=i;
name=n;
}

void display()
{
	System.out.println(id+" "+name);
}
public static void main(String args[])
{
	paraconstructor s1=new paraconstructor(12,"Devu");
	s1.display();
}
}