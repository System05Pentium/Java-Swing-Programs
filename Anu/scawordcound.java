import java.util.Scanner;
class scawordcound
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the string");
	String input=obj.nextLine();
	int worcount=countword(input);
	System.out.println("Number of words in a string is :"  +  worcount);
}
 public static int countword(String str)
{
	//str=str.trim();
	String[] words=str.split("\\s+");
	return words.length;
}
}
