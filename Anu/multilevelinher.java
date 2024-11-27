class college
{
void display()
{
	String Name="SAS SNDP YOGUM COLLEGE KONNI";
System.out.println("College Name :"+" "+Name);
}	
}
class department extends college
{
void display1()
{
	String Dep="MSC Computer Science";
	System.out.println("Department Name:"+" "+Dep);
}
}

class student extends department
{
void display2()
{
	String name="Anupriya P";
	int regno=2100648;
	System.out.println("Student Name:"+" "+name);
	System.out.println("Register Number:"+" "+regno);
}
}

class multilevelinher
{	
public static void main(String args[])
{
	 //college s1=new college();
	//department s2=new department();
	student s3=new student();
	s3.display();
	s3.display1();
	s3.display2();
}
}
