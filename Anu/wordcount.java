class wordcount
{
public static void main(String args[])
{
	String input="Enter your sting";
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
