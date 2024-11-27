import java.util.Scanner;
class college
{
	String course,name,college;
	int rollno;	
void display()
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Name of the Student: " );
	name=obj.nextLine();
	System.out.println("Roll No of the Student: " );
	rollno=obj.nextInt();
	System.out.println("Name of the College: " );
	college=obj.nextLine();
	System.out.println("Course Name: " );
	course=obj.nextLine();
	
	
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

class sininhersca
{	
public static void main(String args[])
{
	
	student s3=new student();
	s3.display();
	s3.display1();
	s3.display2();
}
}
