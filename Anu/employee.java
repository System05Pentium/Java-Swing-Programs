import java.util.Scanner;
class employee
{
public static void main(String args[])
{
	int empid,empbsal;
	float emphra,empde;
	String empname;
Scanner obj=new Scanner(System.in);
System.out.println("Enter emp id: ");
	empid=obj.nextInt();
	
System.out.println("Enter emp name: ");
	empname =obj.nextLine();
	empname =obj.nextLine();
System.out.println("Enter emp Basic Salary: ");
	empbsal=obj.nextInt();
	
System.out.println("Enter emp hra: ");
	emphra=obj.nextFloat();
	
System.out.println("Enter emp tax deduction: ");
	empde=obj.nextFloat();	
	float totasal=(empbsal+emphra)-empde;
	
	System.out.println(" Employe id is            : "  +empid );
	System.out.println(" Employe Name is          : "  +empname );
	System.out.println(" Employe Basic Salary is  : "  +empbsal );
	System.out.println(" Employe Hra is           : "  +emphra );
	System.out.println(" Employe Tax Deduction is : "  +empde );
	System.out.println(" Employe Total Salary is  : "  +totasal );
	

}
}
