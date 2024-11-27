import java.util.Scanner;
class scawordcountlop
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int count=0;
System.out.println("Enter the string");
	String input=obj.nextLine();
	for(int i=0;input.length()>i;i++)
	{
	if(input.charAt(i)==' ')
	{
		count++;
	}
	}
	count++;
	System.out.println("Number of words in a string is : "  +  (count-1));
	

}
}
